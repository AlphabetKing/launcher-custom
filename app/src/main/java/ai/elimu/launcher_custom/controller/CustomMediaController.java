package ai.elimu.launcher_custom.controller;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;

import ai.elimu.launcher_custom.R;

/**
 * Created by ADDAMz on 05.09.2018.
 */

public class CustomMediaController extends MediaController {

    private ImageButton mLoopButton;
    private Context mContext;
    private LoopButtonState currentState = LoopButtonState.DISABLED;
    private Runnable loopButtonClickCb;

    public enum LoopButtonState {
        ENABLED,
        DISABLED
    }

    public CustomMediaController(Context context) {
        super(context);
        mContext = context;
    }

    @Override
    public void setAnchorView(View view) {
        super.setAnchorView(view);

        LayoutParams frameParams = new LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        frameParams.width = (int)( getMeasuredHeight()*0.55);
        frameParams.height = (int)( getMeasuredHeight()*0.55);
        frameParams.topMargin = 12;
        frameParams.gravity = Gravity.RIGHT|Gravity.TOP;

        View custView = makeView();
        addView(custView,frameParams);
    }

    private View makeView() {
        mLoopButton = new ImageButton(mContext);
        mLoopButton.setImageResource(R.drawable.loop_btn_dis);
        mLoopButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        mLoopButton.setAdjustViewBounds(true);
        mLoopButton.setBackground(null);

        mLoopButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(loopButtonClickCb != null)
                    loopButtonClickCb.run();
            }
        });

        return mLoopButton;
    }

    public void setButtonState(LoopButtonState state) {
        Log.d(getClass().getName(), "SET BUTTON STATE " + String.valueOf(state));
        if(state == LoopButtonState.DISABLED) {
            mLoopButton.setImageResource(R.drawable.loop_btn_dis);
            mLoopButton.invalidate();
        } else {
            mLoopButton.setImageResource(R.drawable.loop_btn_enab);
            mLoopButton.invalidate();
        }
    }

    public void setLoopButtonCallback(Runnable callback) {
        loopButtonClickCb = callback;
    }
}
