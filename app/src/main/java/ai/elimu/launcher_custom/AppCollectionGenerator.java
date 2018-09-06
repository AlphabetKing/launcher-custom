package ai.elimu.launcher_custom;

import android.app.Application;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import ai.elimu.launcher_custom.model.AppCategory;
import ai.elimu.launcher_custom.model.AppCollection;
import ai.elimu.launcher_custom.model.AppGroup;
import ai.elimu.model.gson.admin.ApplicationGson;

public class AppCollectionGenerator {

    // TODO: fetch via Appstore library
    public static AppCollection loadAppCollectionEnglish() {
        Log.i(AppCollectionGenerator.class.getName(), "loadAppCollectionEnglish");

        AppCollection appCollection = new AppCollection();

        List<AppCategory> appCategories = new ArrayList<>();

        //com.alphabetking.literacy.find_letter.sw

        // 00 Logic
        AppCategory appCategoryLogic = new AppCategory();
        appCategoryLogic.setName("Logic");
        List<AppGroup> appGroupsLogic = new ArrayList<>();

        appGroupsLogic.add(loadAppGroup("Group 1",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw"
        ));
        appGroupsLogic.add(loadAppGroup("Group 2",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw"
        ));
        appGroupsLogic.add(loadAppGroup("Group 3",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw"
        ));
        appGroupsLogic.add(loadAppGroup("Group 4",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw",
                "com.alphabetking.literacy.find_letter.sw"
        ));
        appGroupsLogic.add(loadAppGroup("Group 5",
                "com.alphabetking.literacy.find_letter.sw"
        ));

//        appGroupsLogic.add(loadAppGroup("Group 1",
//                "com.alphabetking.logic.find_colors",
//                "com.thealphabetking.kidsedu.find_shape",
//                "com.alphabetking.logic.find_shadows",
//                "com.alphabetking.logic.find_section",
//                "com.alphabetking.logic.pairs_font_and_back",
//                "no.leaplearning.logic.mirror_pattern"
//        ));
//        appGroupsLogic.add(loadAppGroup("Group 2",
//                "com.alphabetking.logic.pattern",
//                "com.alphabetking.logic.whatshapefits",
//                "com.alphabetking.logic.find_pairs",
//                "com.alphabetking.logic.match_pairs",
//                "com.alphabetking.logic.missingpart",
//                "com.alphabetking.logic.find_shape_mix"
//        ));
//        appGroupsLogic.add(loadAppGroup("Group 3",
//                "com.alphabetking.logic.match_3_mix",
//                "com.alphabetking.logic.sequence",
//                "com.alphabetking.logic.matrix",
//                "com.alphabetking.logic.match_belong",
//                "com.alphabetking.logic.whatfits",
//                "com.alphabetking.logic.find_3d_shapes"                             //MISSING for 7"
//        ));
//        appGroupsLogic.add(loadAppGroup("Group 4",
//                "com.alphabetking.logic.puzzle_image",
//                "com.alphabetking.logic.find_opposite",
//                "com.alphabetking.logic.match_opposite",
//                "com.alphabetking.logic.find_senses",
//                "com.alphabetking.literacy.sort_it_out",
//                "com.alphabetking.logic.time"
//        ));
//        appGroupsLogic.add(loadAppGroup("Group 5",
//                "com.alphabetking.logic.sequence_programming"
//        ));
        appCategoryLogic.setAppGroups(appGroupsLogic);
        appCategories.add(appCategoryLogic);


        // 01 Letter sounds
        AppCategory appCategoryLetterSounds = new AppCategory();
        appCategoryLetterSounds.setName("Letter sounds");
        List<AppGroup> appGroupsLetterSounds = new ArrayList<>();
        appGroupsLetterSounds.add(loadAppGroup("Group 1",
                "com.alphabetking.logic.find_rhymes",
                "com.alphabetking.literacy.match_rhymes",
                "com.alphabetking.literacy.pairs_rhymes",
                "com.thealphabetking.kidsedu.memory.rhymes",
                "com.alphabetking.literacy.syllables1",
                "com.alphabetking.literacy.syllables2"
        ));
        appGroupsLetterSounds.add(loadAppGroup("Group 2",
                "com.alphabetking.literacy.sort_first_sound",
                "com.alphabetking.literacy.sort_last_sound",
                "com.alphabetking.literacy.sort_middle_sound",
                "com.alphabetking.literacy.sound_small_words",
                "com.alphabetking.literacy.sounding"
        ));
        appGroupsLetterSounds.add(loadAppGroup("Group 3",
                "com.alphabetking.literacy.first_sound_puzzle",
                "com.alphabetking.literacy.find_letter",
                "com.alpahetking.literacy.find_letter_sound",
                "com.alphabetking.literacy.starting_sound_puzzle",
                "com.alphabetking.literacy.find_vowels",
                "com.alphabetking.literacy.sortvowels"
        ));
        appGroupsLetterSounds.add(loadAppGroup("Group 4",
                "com.alphabetking.literacy.remember_sounds",
                "com.alphabetking.logic.match_blends",
                "com.alphabetking.literacy.flashcard_blends",
                "com.alphabetking.literacy.find_letter_name",
                "com.alphabetking.literacy.music_video",
                "com.alphabetking.literacy.how_to_say"
        ));
        appGroupsLetterSounds.add(loadAppGroup("Group 5",
                "com.alphabetking.literacy.flashcard",
                "com.alphabetking.literacy.flashcard_letter_sounds",
                "com.alphabetking.literacy.starting_sound",
                "com.alphabetking.literacy.flashcard_vowels",
                "com.alphabetking.literacy.flashcard_alphabet"
        ));

        appGroupsLetterSounds.add(loadAppGroup("Group 6",
                "com.gmail.programmersimeon.memory_sounds_sounds",
                "com.thealphabetking.kidsedu.memory.letters_sounds"
        ));
        appCategoryLetterSounds.setAppGroups(appGroupsLetterSounds);
        appCategories.add(appCategoryLetterSounds);


        // 02 Listening to stories
        AppCategory appCategoryListeningToStories = new AppCategory();
        appCategoryListeningToStories.setName("Listening to stories");
        List<AppGroup> appGroupsListeningToStories = new ArrayList<>();
        appGroupsListeningToStories.add(loadAppGroup("Group 1",
                "com.alphabetking.story.level_a_auto",
                "com.alphabetking.story.level_b_auto",
                "com.alphabetking.story.level_c_auto",
                "com.alphabetking.story.level_d_auto"
        ));
        appGroupsListeningToStories.add(loadAppGroup("Group 2",
                "com.alphabetking.story.mariama_auto",
                "com.alphabetking.story.mariama_and_mousa_auto",
                "com.alphabetking.story.mousa_auto"
        ));
        appGroupsListeningToStories.add(loadAppGroup("Group 3",
                "com.alphabetking.story.monkeys_auto",
                "com.alphabetking.story.monkeys_2_auto",
                "com.alphabetking.story.penguins_auto",
                "com.alphabetking.story.the_hen_auto",
                "com.alphabetking.story.story_ak_auto"
        ));
        appGroupsListeningToStories.add(loadAppGroup("Group 4",
        "com.alphabetking.literacy.create_story"
        ));
        appCategoryListeningToStories.setAppGroups(appGroupsListeningToStories);
        appCategories.add(appCategoryListeningToStories);


        // 03 Letter shapes
        AppCategory appCategoryLetterShapes = new AppCategory();
        appCategoryLetterShapes.setName("Letter shapes");
        List<AppGroup> appGroupsLetterShapes = new ArrayList<>();
        appGroupsLetterShapes.add(loadAppGroup("Group 1",
                "com.alphabetking.literacy.find_letter_in_image",
                "com.alphabetking.literacy.letters_in_grid",
                "com.alphabetking.literacy.puzzle_alphabet",
                "com.alphabetking.literacy.puzzle",
                "com.alphabetking.literacy.parking_letters"
        ));
        appGroupsLetterShapes.add(loadAppGroup("Group 2",
                "com.alphabetking.literacy.find_letter_in_text",
                "com.alphabetking.literacy.paint"
        ));
        appGroupsLetterShapes.add(loadAppGroup("Group 3",
                "com.alphabetking.literacy.match_small_letters",
                "com.alphabetking.literacy.match_capital_letters",
                "com.alphabetking.literacy.match_mixed_letters",
                "com.alphabetking.literacy.memory_letters"
                //"com.alphabetking.literacy.match_letters", // BUNDLE app - not to be in launcher
        ));
        appGroupsLetterShapes.add(loadAppGroup("Group 4",
                "com.alphabetking.literacy.alphabetical_order_one",
                "com.alphabetking.literacy.alphabetical_order_two",
                "com.alphabetking.literacy.alphabetical_order_three",
                "com.alphabetking.literacy.match_letters_words"
        ));
        appCategoryLetterShapes.setAppGroups(appGroupsLetterShapes);
        appCategories.add(appCategoryLetterShapes);


        // 04 Writing
        AppCategory appCategoryWriting = new AppCategory();
        appCategoryWriting.setName("Writing");
        List<AppGroup> appGroupsWriting = new ArrayList<>();
        appGroupsWriting.add(loadAppGroup("Group 1",
                "com.alphabetking.literacy.drawing_line",
                "com.alphabetking.literacy.how_to_write",
                //"com.alphabetking.literacy.trace",                             //MISSING for 7"
                "com.alphabetking.literacy.trace.so",
                "com.alphabetking.literacy.write"
        ));
        appCategoryWriting.setAppGroups(appGroupsWriting);
        appCategories.add(appCategoryWriting);


        // 05 Blending
        AppCategory appCategoryBlending = new AppCategory();
        appCategoryBlending.setName("Blending");
        List<AppGroup> appGroupsBlending = new ArrayList<>();
        appGroupsBlending.add(loadAppGroup("Group 1",
                "com.alphabetking.literacy.spelling_first_sound",
                "com.alphabetking.literacy.spelling_last_sound",
                "com.alphabetking.literacy.spelling_middle_sound",
                "com.alphabetking.literacy.spelling_small_words"
        ));
        appGroupsBlending.add(loadAppGroup("Group 2",
                "com.alphabetking.literacy.spelling2",
                "com.alphabetking.literacy.sentence_spell",
                "com.alphabetking.literacy.spelling_vowels",
                "com.alphabetking.literacy.split_the_word",                          //MISSING for 7"
                "com.alphabetking.literacy.blending"
        ));
        appGroupsBlending.add(loadAppGroup("Group 3",
                "com.alphabetking.literacy.puzzle_small_words",
                "com.alphabetking.literacy.puzzle_blends",
                "com.alphabetking.literacy.find_word_in_line",
                "com.alphabetking.literacy.gird_small_words",
                //"com.alphabetking.literacy.gird_small_words_bundle",
                "com.alphabetking.literacy.grid_huge_word"
        ));
        appCategoryBlending.setAppGroups(appGroupsBlending);
        appCategories.add(appCategoryBlending);


        // 06 Words
        AppCategory appCategoryWords = new AppCategory();
        appCategoryWords.setName("Words");
        List<AppGroup> appGroupsWords = new ArrayList<>();
        appGroupsWords.add(loadAppGroup("Group 1",
                "com.alphabetking.literacy.small_words",
                "com.alphabetking.literacy.pronouns",
                "com.alphabetking.literacy.wordpuzzle",
                "com.alphabetking.literacy.grid_sight_words",
                "com.alphabetking.literacy.fast_reader",
                "com.alphabetking.literacy.days_and_months"
        ));
        appGroupsWords.add(loadAppGroup("Group 2",
                "com.alphabetking.literacy.room",
                "com.alphabetking.literacy.words",
                "com.alphabetking.literacy.bodyparts_africa",
                "com.alphabetking.literacy.record_word",
                "com.alphabetking.literacy.select_correct_spelling",
                "com.alphabetking.literacy.sneakye"
        ));
        appGroupsWords.add(loadAppGroup("Group 3",
                "com.alphabetking.literacy.sort_text",
                "com.alphabetking.literacy.fake_or_real",
                "com.alphabetking.literacy.parking_words",
                "com.alphabetking.literacy.opposite",
                "com.alphabetking.literacy.preposition",
                "com.alphabetking.literacy.compare_colour"
        ));
        appGroupsWords.add(loadAppGroup("Group 4",
                "com.alphabetking.literacy.numbers",
                "com.alphabetking.literacy.plural_nouns",
                "com.alphabetking.literacy.compare_size",
                "com.alphabetking.literacy.family_words_in_grid",
                "com.alphabetking.literacy.noun_or_verb"
        ));

        appGroupsWords.add(loadAppGroup("Group 5",
                "com.alphabetking.literacy.memory_images",
                "com.alphabetking.literacy.memory_sound_image",
                "com.gmail.programmersimeon.memory_sound_word",
                "com.gmail.programmersimeon.memory_word_image",
                "com.gmail.programmersimeon.memory_word"
        ));
        appCategoryWords.setAppGroups(appGroupsWords);
        appCategories.add(appCategoryWords);


        // 07 Sentences
        AppCategory appCategorySentences = new AppCategory();
        appCategorySentences.setName("Sentences");
        List<AppGroup> appGroupsSentences = new ArrayList<>();
        appGroupsSentences.add(loadAppGroup("Group 1",
                "com.alphabetking.literacy.sentence_verbs_to_be",
                "com.alphabetking.literacy.sentence_verbs",
                "com.alphabetking.literacy.sentence_nouns",
                "com.alphabetking.literacy.sentence_prepositions",
                "com.alphabetking.literacy.sentence_questions",
                "com.alphabetking.literacy.punctuation"
        ));
        appGroupsSentences.add(loadAppGroup("Group 2",
                "com.alphabetking.literacy.complete_sentence",
                "com.alphabetking.literacy.match_sentences_1",
                "com.alphabetking.literacy.match_sentences_2",
                "com.alphabetking.literacy.match_sentences_3",
                "com.alphabetking.literacy.match_sentences_4",
                "com.alphabetking.literacy.colouring_book_2"
        ));
        appGroupsSentences.add(loadAppGroup("Group 3",
                "com.alphabetking.literacy.room_and_concepts",
                "com.alphabetking.literacy.record_sentence",
                "com.alphabetking.literacy.grid_sentences",
                "com.alphabetking.literacy.reading_comprehension",
                "com.alphabetking.literacy.sequence_sentence",
                "com.alphabetking.literacy.sight_word_sentence"
        ));
        appGroupsSentences.add(loadAppGroup("Group 4",
                "com.alphabetking.literacy.make_the_sentence_1",
                "com.alphabetking.literacy.make_the_sentence_2",
                "com.alphabetking.literacy.make_the_sentence_3",
                "com.alphabetking.literacy.sexual_abuse_complete",
                "com.alphabetking.literacy.sexual_abuse_mount",
                "com.alphabetking.literacy.verb_form"
        ));
        appCategorySentences.setAppGroups(appGroupsSentences);
        appCategories.add(appCategorySentences);


        // 08 Reading stories
        AppCategory appCategoryReadingStories = new AppCategory();
        appCategoryReadingStories.setName("Reading stories");
        List<AppGroup> appGroupsReadingStories = new ArrayList<>();
        appGroupsReadingStories.add(loadAppGroup("Group 1",
                "com.alphabetking.story.level_a",
                "com.alphabetking.story.level_b",
                "com.alphabetking.story.level_c",
                "com.alphabetking.story.level_d"
        ));
        appGroupsReadingStories.add(loadAppGroup("Group 2",
                "com.alphabetking.story.mariama",
                "com.alphabetking.story.mariama_and_mousa",
                "com.alphabetking.story.mousa"
        ));
        appGroupsReadingStories.add(loadAppGroup("Group 3",
                "com.alphabetking.story.monkeys",
                "com.alphabetking.story.monkeys_2",
                "com.alphabetking.story.penguins",
                "com.alphabetking.story.the_hen",
                "no.leaplearning.literacy.pdf_reader"
        ));
        appCategoryReadingStories.setAppGroups(appGroupsReadingStories);
        appCategories.add(appCategoryReadingStories);

/*
// 09 Numeracy
        AppCategory appCategoryNumeracy = new AppCategory();
        appCategoryNumeracy.setName("Numeracy");
        List<AppGroup> appGroupsNumeracy = new ArrayList<>();
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.color_squares",
                "com.alphabetking.logic.mirror_pattern",
                "com.alphabetking.logic.color_fractions",
                "com.alphabetking.numeracy.table",
                "com.alphabetking.numbers.quantity",
                "com.alphabetking.math.bigger_smaller"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.number.number_in_line",
                "com.alphabetking.number.find_the_number_missing",
                "com.alphabetking.number.find_the_number",
                "com.alphabetking.number.match_numbers",
                "com.alphabetking.number.sort_numbers"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.numbers.stacking",
                "com.alphabetking.numeracy.find_from_image"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.color_grid",
                "com.alphabetking.math.family_house",
                "com.alphabetking.numeracy.split_the_number",
                "com.alphabetking.math.ten_cross",
                "com.alphabetking.math.math_room_mix"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.addition",
                "com.alphabetking.math.sort_addition",
                "com.alphabetking.math.whats_missing_addition",
                "com.alphabetking.numeracy.compare_addition",
                "com.alphabetking.math.sort_plus"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.color_square_addition",
                "com.alphabetking.math.math_room_addition",
                "com.alphabetking.math.puzzle_addition",
                "com.alphabetking.math.matrix_addition"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.subtraction",
                "com.alphabetking.math.sort_subtraction",
                "com.alphabetking.math.whats_missing_subtraction",
                "com.alphabetking.numeracy.compare_substraction"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.math_room_subtraction",
                "com.alphabetking.math.puzzle_subtraction",
                "com.alphabetking.math.matrix_subtraction"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.multiplication",
                "com.alphabetking.math.sort_multiplication",
                "com.alphabetking.math.whats_missing_multiplication",
                "com.alphabetking.math.matrix_multiplication"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.divison"
        ));

        appCategoryNumeracy.setAppGroups(appGroupsNumeracy);
        appCategories.add(appCategoryNumeracy);
*/
/*
        // Test app
        AppCategory appCategoryTest = new AppCategory();
        appCategoryTest.setName("Test app");
        List<AppGroup> appGroupsTest = new ArrayList<>();

        appGroupsTest.add(loadAppGroup(
                "com.gmail.programmersimeon.test_app"
        ));
        appCategoryTest.setAppGroups(appGroupsTest);
        appCategories.add(appCategoryTest);
*/


        appCollection.setAppCategories(appCategories);

        return appCollection;
    }

    // TODO: fetch via Appstore library
    public static AppCollection loadAppCollectionEnglishAndNumeracy() {
        Log.i(AppCollectionGenerator.class.getName(), "loadAppCollectionEnglishAndNumeracy");

        AppCollection appCollection = new AppCollection();

        List<AppCategory> appCategories = new ArrayList<>();


        // 00 Logic
        AppCategory appCategoryLogic = new AppCategory();
        appCategoryLogic.setName("Logic");
        List<AppGroup> appGroupsLogic = new ArrayList<>();
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.find_colors",
                "com.thealphabetking.kidsedu.find_shape",
                "com.alphabetking.logic.find_shadows",
                "com.alphabetking.logic.find_section",
                "com.alphabetking.logic.pairs_font_and_back",
                "no.leaplearning.logic.mirror_pattern"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.pattern",
                "com.alphabetking.logic.whatshapefits",
                "com.alphabetking.logic.find_pairs",
                "com.alphabetking.logic.match_pairs",
                "com.alphabetking.logic.missingpart",
                "com.alphabetking.logic.find_shape_mix"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.match_3_mix",
                "com.alphabetking.logic.sequence",
                "com.alphabetking.logic.matrix",
                "com.alphabetking.logic.match_belong",
                "com.alphabetking.logic.whatfits",
                "com.alphabetking.logic.find_3d_shapes"                             //MISSING for 7"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.puzzle_image",
                "com.alphabetking.logic.find_opposite",
                "com.alphabetking.logic.match_opposite",
                "com.alphabetking.logic.find_senses",
                "com.alphabetking.literacy.sort_it_out",
                "com.alphabetking.logic.time"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.sequence_programming"
        ));
        appCategoryLogic.setAppGroups(appGroupsLogic);
        appCategories.add(appCategoryLogic);


        // 01 Letter sounds
        AppCategory appCategoryLetterSounds = new AppCategory();
        appCategoryLetterSounds.setName("Letter sounds");
        List<AppGroup> appGroupsLetterSounds = new ArrayList<>();
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.logic.find_rhymes",
                "com.alphabetking.literacy.match_rhymes",
                "com.alphabetking.literacy.pairs_rhymes",
                "com.thealphabetking.kidsedu.memory.rhymes",
                "com.alphabetking.literacy.syllables1",
                "com.alphabetking.literacy.syllables2"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.literacy.sort_first_sound",
                "com.alphabetking.literacy.sort_last_sound",
                "com.alphabetking.literacy.sort_middle_sound",
                "com.alphabetking.literacy.sound_small_words",
                "com.alphabetking.literacy.sounding"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.literacy.first_sound_puzzle",
                "com.alphabetking.literacy.find_letter",
                "com.alpahetking.literacy.find_letter_sound",
                "com.alphabetking.literacy.starting_sound_puzzle",
                "com.alphabetking.literacy.find_vowels",
                "com.alphabetking.literacy.sortvowels"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.literacy.remember_sounds",
                "com.alphabetking.logic.match_blends",
                "com.alphabetking.literacy.flashcard_blends",
                "com.alphabetking.literacy.find_letter_name",
                "com.alphabetking.literacy.music_video",
                "com.alphabetking.literacy.how_to_say"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.literacy.flashcard",
                "com.alphabetking.literacy.flashcard_letter_sounds",
                "com.alphabetking.literacy.starting_sound",
                "com.alphabetking.literacy.flashcard_vowels",
                "com.alphabetking.literacy.flashcard_alphabet"
        ));

        appGroupsLetterSounds.add(loadAppGroup(
                "com.gmail.programmersimeon.memory_sounds_sounds",
                "com.thealphabetking.kidsedu.memory.letters_sounds"
        ));
        appCategoryLetterSounds.setAppGroups(appGroupsLetterSounds);
        appCategories.add(appCategoryLetterSounds);


        // 02 Listening to stories
        AppCategory appCategoryListeningToStories = new AppCategory();
        appCategoryListeningToStories.setName("Listening to stories");
        List<AppGroup> appGroupsListeningToStories = new ArrayList<>();
        appGroupsListeningToStories.add(loadAppGroup(
                "com.alphabetking.story.level_a_auto",
                "com.alphabetking.story.level_b_auto",
                "com.alphabetking.story.level_c_auto",
                "com.alphabetking.story.level_d_auto"
        ));
        appGroupsListeningToStories.add(loadAppGroup(
                "com.alphabetking.story.mariama_auto",
                "com.alphabetking.story.mariama_and_mousa_auto",
                "com.alphabetking.story.mousa_auto"
        ));
        appGroupsListeningToStories.add(loadAppGroup(
                "com.alphabetking.story.monkeys_auto",
                "com.alphabetking.story.monkeys_2_auto",
                "com.alphabetking.story.penguins_auto",
                "com.alphabetking.story.the_hen_auto",
                "com.alphabetking.story.story_ak_auto"
        ));
        appGroupsListeningToStories.add(loadAppGroup(
                "com.alphabetking.literacy.create_story"
        ));
        appCategoryListeningToStories.setAppGroups(appGroupsListeningToStories);
        appCategories.add(appCategoryListeningToStories);


        // 03 Letter shapes
        AppCategory appCategoryLetterShapes = new AppCategory();
        appCategoryLetterShapes.setName("Letter shapes");
        List<AppGroup> appGroupsLetterShapes = new ArrayList<>();
        appGroupsLetterShapes.add(loadAppGroup(
                "com.alphabetking.literacy.find_letter_in_image",
                "com.alphabetking.literacy.letters_in_grid",
                "com.alphabetking.literacy.puzzle_alphabet",
                "com.alphabetking.literacy.puzzle",
                "com.alphabetking.literacy.parking_letters"
        ));
        appGroupsLetterShapes.add(loadAppGroup(
                "com.alphabetking.literacy.find_letter_in_text",
                "com.alphabetking.literacy.paint"
        ));
        appGroupsLetterShapes.add(loadAppGroup(
                "com.alphabetking.literacy.match_small_letters",
                "com.alphabetking.literacy.match_capital_letters",
                "com.alphabetking.literacy.match_mixed_letters",
                "com.alphabetking.literacy.memory_letters"
                //"com.alphabetking.literacy.match_letters", // BUNDLE app - not to be in launcher
        ));
        appGroupsLetterShapes.add(loadAppGroup(
                "com.alphabetking.literacy.alphabetical_order_one",
                "com.alphabetking.literacy.alphabetical_order_two",
                "com.alphabetking.literacy.alphabetical_order_three",
                "com.alphabetking.literacy.match_letters_words"
        ));
        appCategoryLetterShapes.setAppGroups(appGroupsLetterShapes);
        appCategories.add(appCategoryLetterShapes);


        // 04 Writing
        AppCategory appCategoryWriting = new AppCategory();
        appCategoryWriting.setName("Writing");
        List<AppGroup> appGroupsWriting = new ArrayList<>();
        appGroupsWriting.add(loadAppGroup(
                "com.alphabetking.literacy.drawing_line",
                "com.alphabetking.literacy.how_to_write",
                //"com.alphabetking.literacy.trace",                             //MISSING for 7"
                "com.alphabetking.literacy.trace.so",
                "com.alphabetking.literacy.write"
        ));
        appCategoryWriting.setAppGroups(appGroupsWriting);
        appCategories.add(appCategoryWriting);


        // 05 Blending
        AppCategory appCategoryBlending = new AppCategory();
        appCategoryBlending.setName("Blending");
        List<AppGroup> appGroupsBlending = new ArrayList<>();
        appGroupsBlending.add(loadAppGroup(
                "com.alphabetking.literacy.spelling_first_sound",
                "com.alphabetking.literacy.spelling_last_sound",
                "com.alphabetking.literacy.spelling_middle_sound",
                "com.alphabetking.literacy.spelling_small_words"
        ));
        appGroupsBlending.add(loadAppGroup(
                "com.alphabetking.literacy.spelling2",
                "com.alphabetking.literacy.sentence_spell",
                "com.alphabetking.literacy.spelling_vowels",
                "com.alphabetking.literacy.split_the_word",                          //MISSING for 7"
                "com.alphabetking.literacy.blending"
        ));
        appGroupsBlending.add(loadAppGroup(
                "com.alphabetking.literacy.puzzle_small_words",
                "com.alphabetking.literacy.puzzle_blends",
                "com.alphabetking.literacy.find_word_in_line",
                "com.alphabetking.literacy.gird_small_words",
                //"com.alphabetking.literacy.gird_small_words_bundle",
                "com.alphabetking.literacy.grid_huge_word"
        ));
        appCategoryBlending.setAppGroups(appGroupsBlending);
        appCategories.add(appCategoryBlending);


        // 06 Words
        AppCategory appCategoryWords = new AppCategory();
        appCategoryWords.setName("Words");
        List<AppGroup> appGroupsWords = new ArrayList<>();
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.small_words",
                "com.alphabetking.literacy.pronouns",
                "com.alphabetking.literacy.wordpuzzle",
                "com.alphabetking.literacy.grid_sight_words",
                "com.alphabetking.literacy.fast_reader",
                "com.alphabetking.literacy.days_and_months"
        ));
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.room",
                "com.alphabetking.literacy.words",
                "com.alphabetking.literacy.bodyparts_africa",
                "com.alphabetking.literacy.record_word",
                "com.alphabetking.literacy.select_correct_spelling",
                "com.alphabetking.literacy.sneakye"
        ));
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.sort_text",
                "com.alphabetking.literacy.fake_or_real",
                "com.alphabetking.literacy.parking_words",
                "com.alphabetking.literacy.opposite",
                "com.alphabetking.literacy.preposition",
                "com.alphabetking.literacy.compare_colour"
        ));
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.numbers",
                "com.alphabetking.literacy.plural_nouns",
                "com.alphabetking.literacy.compare_size",
                "com.alphabetking.literacy.family_words_in_grid"
        ));

        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.memory_images",
                "com.alphabetking.literacy.memory_sound_image",
                "com.gmail.programmersimeon.memory_sound_word",
                "com.gmail.programmersimeon.memory_word_image",
                "com.gmail.programmersimeon.memory_word"
        ));
        appCategoryWords.setAppGroups(appGroupsWords);
        appCategories.add(appCategoryWords);


        // 07 Sentences
        AppCategory appCategorySentences = new AppCategory();
        appCategorySentences.setName("Sentences");
        List<AppGroup> appGroupsSentences = new ArrayList<>();
        appGroupsSentences.add(loadAppGroup(
                "com.alphabetking.literacy.sentence_verbs_to_be",
                "com.alphabetking.literacy.sentence_verbs",
                "com.alphabetking.literacy.sentence_nouns",
                "com.alphabetking.literacy.sentence_prepositions",
                "com.alphabetking.literacy.sentence_questions",
                "com.alphabetking.literacy.punctuation"
        ));
        appGroupsSentences.add(loadAppGroup(
                "com.alphabetking.literacy.complete_sentence",
                "com.alphabetking.literacy.match_sentences_1",
                "com.alphabetking.literacy.match_sentences_2",
                "com.alphabetking.literacy.match_sentences_3",
                "com.alphabetking.literacy.match_sentences_4",
                "com.alphabetking.literacy.colouring_book_2"
        ));
        appGroupsSentences.add(loadAppGroup(
                "com.alphabetking.literacy.room_and_concepts",
                "com.alphabetking.literacy.record_sentence",
                "com.alphabetking.literacy.grid_sentences",
                "com.alphabetking.literacy.reading_comprehension",
                "com.alphabetking.literacy.sequence_sentence",
                "com.alphabetking.literacy.sight_word_sentence"
        ));
        appGroupsSentences.add(loadAppGroup(
                "com.alphabetking.literacy.make_the_sentence_1",
                "com.alphabetking.literacy.make_the_sentence_2",
                "com.alphabetking.literacy.make_the_sentence_3",
                "com.alphabetking.literacy.sexual_abuse_complete",
                "com.alphabetking.literacy.sexual_abuse_mount",
                "com.alphabetking.literacy.verb_form"
        ));
        appCategorySentences.setAppGroups(appGroupsSentences);
        appCategories.add(appCategorySentences);


        // 08 Reading stories
        AppCategory appCategoryReadingStories = new AppCategory();
        appCategoryReadingStories.setName("Reading stories");
        List<AppGroup> appGroupsReadingStories = new ArrayList<>();
        appGroupsReadingStories.add(loadAppGroup(
                "com.alphabetking.story.level_a",
                "com.alphabetking.story.level_b",
                "com.alphabetking.story.level_c",
                "com.alphabetking.story.level_d"
        ));
        appGroupsReadingStories.add(loadAppGroup(
                "com.alphabetking.story.mariama",
                "com.alphabetking.story.mariama_and_mousa",
                "com.alphabetking.story.mousa"
        ));
        appGroupsReadingStories.add(loadAppGroup(
                "com.alphabetking.story.monkeys",
                "com.alphabetking.story.monkeys_2",
                "com.alphabetking.story.penguins",
                "com.alphabetking.story.the_hen",
                "no.leaplearning.literacy.pdf_reader"
        ));
        appCategoryReadingStories.setAppGroups(appGroupsReadingStories);
        appCategories.add(appCategoryReadingStories);


        // Numbers
        AppCategory appCategoryNumbers = new AppCategory();
        appCategoryNumbers.setName("Numbers");
        List<AppGroup> appGroupsNumbers = new ArrayList<>();
        appGroupsNumbers.add(loadAppGroup(
                "no.leaplearning.numeracy.color_squares",
                "no.leaplearning.numeracy.find_number",
                "no.leaplearning.numeracy.match_number",
                "no.leaplearning.numeracy.sort_quantity",
                "no.leaplearning.numeracy.numbers_in_grid",
                "no.leaplearning.numeracy.find_the_number_in_image"
        ));
        appGroupsNumbers.add(loadAppGroup(
                //"com.alphabetking.number.number_in_line",
                "no.leaplearning.numeracy.find_the_number",
                "no.leaplearning.numeracy.find_the_number_sound",
                "no.leaplearning.numeracy.parking_numbers",
                "no.leaplearning.numeracy.number_in_line",
                "com.alphabetking.number.find_the_number_missing",
                "no.leaplearning.numeracy.find_number_in_line"
        ));
        appGroupsNumbers.add(loadAppGroup(
                "no.leaplearning.numeracy.paint_the_number",
                "no.leaplearning.numeracy.memory_numbers",
                "no.leaplearning.numeracy.puzzle_numbers",
                "no.leaplearning.numeracy.jigsaw_puzzle_numbers",
                "com.alphabetking.literacy.remember_the_numbers",
                "no.leaplearning.numeracy.fast_reader_numbers"
        ));
        appGroupsNumbers.add(loadAppGroup(
                "no.leaplearning.numeracy.bigger.smaller",
                "no.leaplearning.numeracy.color_number_10_groups",
                "no.leaplearning.numeracy.unlock_numbers",
                "no.leaplearning.numeracy.skip_jumping",
                "com.alphabetking.numeracy.stacking",
                "no.leaplearning.numeracy.sort_odd_even"
        ));
        appGroupsNumbers.add(loadAppGroup(

                "com.alphabetking.literacy.how_many_each",       // MISSING APK
                "no.leaplearning.numeracy.trace_numbers",                       // MISSING APK
                "no.leaplearning.numeracy.flash_card_numbers"                   // MISSING APK
        ));


        appCategoryNumbers.setAppGroups(appGroupsNumbers);
        appCategories.add(appCategoryNumbers);


        // Addition
        AppCategory appCategoryAddition = new AppCategory();
        appCategoryAddition.setName("Addition");
        List<AppGroup> appGroupsAddition = new ArrayList<>();
        appGroupsAddition.add(loadAppGroup(
                "com.alphabetking.math.addition",
                "com.alphabetking.math.sort_addition",
                "com.alphabetking.numeracy.whats_missing_addition"
        ));
        appGroupsAddition.add(loadAppGroup(
                "com.alphabetking.numeracy.matrix_addition",
                "no.leaplearning.numeracy.split_the_number",
                "com.alphabetking.numeracy.compare_addition",
                "com.alphabetking.numeracy.small_puzzle_addition",
                "no.leaplearning.numeracy.grid_addition",
                "no.leaplearning.numeracy.match_find_addition"
        ));
        appGroupsAddition.add(loadAppGroup(
                "com.alphabetking.numeracy.colour_squares_addition",
                "com.alphabetking.numeracy.color_addition_2",
                "com.alphabetking.math.color_grid",
                "com.alphabetking.numeracy.rainbow",
                "no.leaplearning.numeracy.memory_addition",
                "no.leaplearning.numeracy.find_the_sum_addition"                    // MISSING APK
        ));
        appGroupsAddition.add(loadAppGroup(
                "no.leaplearning.numeracy.find_match_10_groups",
                "no.leaplearning.numeracy.working_with_10s",
                "com.alphabetking.numeracy.right_or_wrong"
        ));
        appGroupsAddition.add(loadAppGroup(
                "com.alphabetking.numeracy.rooms_addition",
                "com.alphabetking.numeracy.puzzle_addition",
                "com.alphabetking.numeracy.sort_plus",
                "com.alphabetking.numeracy.fast_reader_addition",
                "com.alphabetking.numeracy.parking_addition",
                "no.leaplearning.numeracy.add_under_each_other"
        ));
        appCategoryAddition.setAppGroups(appGroupsAddition);
        appCategories.add(appCategoryAddition);


        // Subtraction
        AppCategory appCategorySubtraction = new AppCategory();
        appCategorySubtraction.setName("Subtraction");
        List<AppGroup> appGroupsSubtraction = new ArrayList<>();
        appGroupsSubtraction.add(loadAppGroup(
                "com.alphabetking.numeracy.subtract",
                "com.alphabetking.numeracy.subtraction",
                "com.alphabetking.math.sort_subtraction"
        ));
        appGroupsSubtraction.add(loadAppGroup(
                "com.alphabetking.numeracy.matrix_subtraction",
                "com.alphabetking.numeracy.whats_missing_subtraction",
                "com.alphabetking.numeracy.compare_subtraction"
        ));
        appGroupsSubtraction.add(loadAppGroup(
                "com.alphabetking.com.numeracy.rooms_subtraction",
                "com.alphabetking.numeracy.puzzle_subtraction",
                "com.alphabetking.numeracy.fast_reader_subtraction",
                "com.alphabetking.numeracy.parking_subtraction",
                "no.leaplearning.numeracy.sub_under_each_other"
        ));
        appGroupsSubtraction.add(loadAppGroup(
                "no.leaplearning.numeracy.right_or_wrong_subtraction",
                "no.leaplearning.numeracy.memory_subtraction",
                "no.leaplearning.numeracy.small_puzzle_subtraction",
                "no.leaplearning.numeracy.subtract_images",
                "no.leaplearning.numeracy.match_minus"
        ));
        appCategorySubtraction.setAppGroups(appGroupsSubtraction);
        appCategories.add(appCategorySubtraction);

/*
        // 03 Multiplication
        AppCategory appCategoryMultiplication = new AppCategory();
        appCategoryMultiplication.setName("Multiplication & Division");
        List<AppGroup> appGroupsMultiplication = new ArrayList<>();
        appGroupsMultiplication.add(loadAppGroup(
                "com.alphabetking.numeracy.multiplication",
                "com.alphabetking.math.sort_multiplication",
                "com.alphabetking.numeracy.whats_missing_multiplication",
                "com.alphabetking.numeracy.room_multiplication"
        ));
        appGroupsMultiplication.add(loadAppGroup(
                "com.alphabetking.numeracy.multiplication_table",
                "com.alphabetking.numeracy.matrix_multiplication",
                "com.alphabetking.numeracy.multiplication_numbers",
                "com.alphabetking.numeracy.fast_reader_multiplication",
                "com.alphabetking.numeracy.parking_multiplication"
        ));
        appGroupsMultiplication.add(loadAppGroup(
                "com.alphabetking.numeracy.division",
                "com.alphabetking.numeracy.room_division",
                "com.alphabetking.numeracy.division_numbers",
                "com.alphabetking.numeracy.matrix_division",
                "com.alphabetking.numeracy.division_table",
                "com.alphabetking.numeracy.sort_division"
        ));
        appGroupsMultiplication.add(loadAppGroup(
                "com.alphabetking.numeracy.parking_division",
                "no.leaplearning.numeracy.match_divison",
                "com.alphabetking.numeracy.fast_reader_division"
        ));
        appCategoryMultiplication.setAppGroups(appGroupsMultiplication);
        appCategories.add(appCategoryMultiplication);
*/
/*
        // 04 Division
        AppCategory appCategoryDivision = new AppCategory();
        appCategoryDivision.setName("Division");
        List<AppGroup> appGroupsDivision = new ArrayList<>();
        appGroupsDivision.add(loadAppGroup(
                "com.alphabetking.numeracy.division",
                "com.alphabetking.numeracy.room_division",
                "com.alphabetking.numeracy.division_numbers",
                "com.alphabetking.numeracy.matrix_division",
                "com.alphabetking.numeracy.division_table",
                "com.alphabetking.numeracy.sort_division"
        ));
        appGroupsDivision.add(loadAppGroup(
                "com.alphabetking.numeracy.parking_division",
                "no.leaplearning.numeracy.match_divison",
                "com.alphabetking.numeracy.fast_reader_division"
        ));
        appCategoryDivision.setAppGroups(appGroupsDivision);
        appCategories.add(appCategoryDivision);
*/
/*
        // 05 Mix-Math
        AppCategory appCategoryMixedMath = new AppCategory();
        appCategoryMixedMath.setName("Mix-math");
        List<AppGroup> appGroupsMixedMath = new ArrayList<>();
        appGroupsMixedMath.add(loadAppGroup(
                "com.alphabetking.numeracy.family_house",
                "com.alphabetking.numeracy.ten_cross",
                "com.alphabetking.numeracy.rooms_mix"
        ));
        appGroupsMixedMath.add(loadAppGroup(
                "com.alphabetking.numeracy.find_from_image",
                "no.leaplearning.numeracy.parking_mix",
                "no.leaplearning.numeracy.memory_plus_minus"
        ));
        appGroupsMixedMath.add(loadAppGroup(
                "no.leaplearning.numeracy.sort_mix_plus_minus",
                "no.leaplearning.numeracy.sort_mix_times_divide",
                "no.leaplearning.numeracy.fast_reader_plus_minus",
                "no.leaplearning.numeracy.fast_reader_times_divide"
        ));
        appGroupsMixedMath.add(loadAppGroup(
                "no.leaplearning.numeracy.table",   //
                "no.leaplearning.numeracy.color_fractions"          //
        ));

        appCategoryMixedMath.setAppGroups(appGroupsMixedMath);
        appCategories.add(appCategoryMixedMath);
*/
/*
        // 06 Concepts
        AppCategory appCategoryConcepts = new AppCategory();
        appCategoryConcepts.setName("Concepts");
        List<AppGroup> appGroupsConcepts = new ArrayList<>();
        appGroupsConcepts.add(loadAppGroup(
                "no.leaplearning.numeracy.table",   //
                "no.leaplearning.numeracy.number_digits",
                "no.leaplearning.numeracy.decimal"
        ));
        appGroupsConcepts.add(loadAppGroup(
                "com.alphabetking.numeracy.ruler",
                "com.alphabetking.logic.scale",
                "no.leaplearning.numeracy.color_fractions"          //
        ));
        appGroupsConcepts.add(loadAppGroup(
                "com.alphabetking.logic.find_correct_size"
        ));
        appGroupsConcepts.add(loadAppGroup(

        ));
        appCategoryConcepts.setAppGroups(appGroupsConcepts);
        appCategories.add(appCategoryConcepts);
*/
/*
        // Test app
        AppCategory appCategoryTest = new AppCategory();
        appCategoryTest.setName("Test app");
        List<AppGroup> appGroupsTest = new ArrayList<>();

        appGroupsTest.add(loadAppGroup(
                "com.gmail.programmersimeon.test_app"
        ));
        appCategoryTest.setAppGroups(appGroupsTest);
        appCategories.add(appCategoryTest);
*/


        appCollection.setAppCategories(appCategories);

        return appCollection;
    }

    // TODO: fetch via Appstore library
    public static AppCollection loadAppCollectionFrench() {
        Log.i(AppCollectionGenerator.class.getName(), "loadAppCollectionFrench");

        AppCollection appCollection = new AppCollection();

        List<AppCategory> appCategories = new ArrayList<>();


        // 00 Logic
        AppCategory appCategoryLogic = new AppCategory();
        appCategoryLogic.setName("Logique");
        List<AppGroup> appGroupsLogic = new ArrayList<>();
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.find_colours.fr",          // F
                "com.alphabetking.logic.find_shapes.fr",                          // F
                "com.alphabetking.logic.find_shadows.fr",                         // F
                "com.alphabetking.logic.find_section",
                "com.alphabetking.logic.pairs_font_and_back"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.make_pattern.fr",          // F
                "com.alphabetking.logic.what_shape_fits.fr",                      // F
                "com.alphabetking.logic.find_pairs",
                "com.alphabetking.logic.matchpairs.fr",                           // F
                "com.alphabetking.logic.find_missing_part.fr",                    // F
                "com.alphabetking.logic.match_missing_part.fr"                    // F
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.match_3_mix.fr",        // F
                "com.alphabetking.logic.sequence.fr",                          // F
                "com.alphabetking.logic.matrix.fr",                            // F
                "com.alphabetking.logic.match_belong",
                "com.alphabetking.logic.what_fits.fr",                         // F
                "com.alphabetking.logic.find_3d_shapes"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.puzzle_image.fr",       // F
                "com.alphabetking.logic.find_opposite",
                "com.alphabetking.logic.match_opposite",
                "com.alphabetking.logic.find_senses",
                "com.alphabetking.logic.sort_it_out.fr",                       // F
                "com.alphabetking.logic.time"
        ));
        appCategoryLogic.setAppGroups(appGroupsLogic);
        appCategories.add(appCategoryLogic);

/*
        // 01 Letter sounds
        AppCategory appCategoryLetterSounds = new AppCategory();
        appCategoryLetterSounds.setName("Letter sounds");
        List<AppGroup> appGroupsLetterSounds = new ArrayList<>();
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.logic.find_rhymes",
                "com.alphabetking.literacy.match_rhymes",
                "com.alphabetking.literacy.pairs_rhymes",
                "com.thealphabetking.kidsedu.memory.rhymes",
                "com.alphabetking.literacy.syllables1",
                "com.alphabetking.literacy.syllables2"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.literacy.sort_first_sound",
                "com.alphabetking.literacy.sort_last_sound",
                "com.alphabetking.literacy.sort_middle_sound",
                "com.alphabetking.literacy.sound_small_words",
                "com.alphabetking.literacy.sounding"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.literacy.first_sound_puzzle",
                "com.alphabetking.literacy.find_letter",
                "com.alpahetking.literacy.find_letter_sound",
                "com.alphabetking.literacy.starting_sound_puzzle",
                "com.alphabetking.literacy.find_vowels",
                "com.alphabetking.literacy.sortvowels"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.literacy.remember_sounds",
                "com.alphabetking.logic.match_blends",
                "com.alphabetking.literacy.flashcard_blends",
                "com.alphabetking.literacy.find_letter_name",
                "com.alphabetking.literacy.music_video",
                "com.alphabetking.literacy.how_to_say"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.literacy.flashcard",
                "com.alphabetking.literacy.flashcard_letter_sounds",
                "com.alphabetking.literacy.starting_sound",
                "com.alphabetking.literacy.flashcard_vowels",
                "com.alphabetking.literacy.flashcard_alphabet"
        ));

        appGroupsLetterSounds.add(loadAppGroup(
                "com.gmail.programmersimeon.memory_sounds_sounds",
                "com.thealphabetking.kidsedu.memory.letters_sounds"
        ));
        appCategoryLetterSounds.setAppGroups(appGroupsLetterSounds);
        appCategories.add(appCategoryLetterSounds);

*/
        // 02 Listening to stories
        AppCategory appCategoryListeningToStories = new AppCategory();
        appCategoryListeningToStories.setName("Écouter des histoires");
        List<AppGroup> appGroupsListeningToStories = new ArrayList<>();
        appGroupsListeningToStories.add(loadAppGroup(
                "com.alphabetking.literacy.books_level_a_auto.fr",
                "no.leaplearning.literacy.books_level_a_auto.fr",
                "no.leaplearning.literacy.books_level_b_auto.fr",
                "com.alphabetking.literacy.books_level_c_auto.fr",
                "com.alphabetking.literacy.books_level_d_auto.fr"
        ));
        appGroupsListeningToStories.add(loadAppGroup(
                "com.alphabetking.literacy.mariama_auto.fr",
                "no.leaplearning.literacy.mariama_and_mousa_auto.fr",
                "com.alphabetking.literacy.mousa_auto.fr"
        ));
        appGroupsListeningToStories.add(loadAppGroup(
                "com.alphabetking.story.monkeys_auto",
                "com.alphabetking.story.monkeys_2_auto",
                "com.alphabetking.story.penguins_auto",
                "com.alphabetking.story.the_hen_auto",
                "com.alphabetking.story.story_ak_auto"
        ));
        appCategoryListeningToStories.setAppGroups(appGroupsListeningToStories);
        appCategories.add(appCategoryListeningToStories);


        // 03 Letter shapes
        AppCategory appCategoryLetterShapes = new AppCategory();
        appCategoryLetterShapes.setName("Letter shapes");
        List<AppGroup> appGroupsLetterShapes = new ArrayList<>();
        appGroupsLetterShapes.add(loadAppGroup(
                "com.alphabetking.literacy.find_letter_in_image.fr",
                "com.alphabetking.literacy.letters_in_grid.fr",
                "com.gmail.bvalbo.letters_in_grid",
                "com.alphabetking.literacy.puzzle_alphabet.fr",
                "com.alphabetking.literacy.puzzle.fr",
                "com.alphabetking.literacy.parking_letters.fr"
        ));
        appGroupsLetterShapes.add(loadAppGroup(
                "com.alphabetking.literacy.find_letter_in_text.fr",
                "com.alphabetking.literacy.paint.fr"
        ));
        appGroupsLetterShapes.add(loadAppGroup(
                "com.alphabetking.literacy.match_small_letters.fr",
                "com.alphabetking.literacy.match_capital_letters.fr",
                "com.alphabetking.literacy.match_mixed_letters.fr",
                "com.alphabetking.literacy.memory_letters.fr"
                //"com.alphabetking.literacy.match_letters", // BUNDLE app - not to be in launcher
        ));
        appGroupsLetterShapes.add(loadAppGroup(
                "com.alphabetking.literacy.alphabetical_order.fr",
                "com.alphabetking.literacy.alphabetical_order_two",
                "com.alphabetking.literacy.alphabetical_order_three",
                "com.alphabetking.literacy.match_letters_words"
        ));
        appCategoryLetterShapes.setAppGroups(appGroupsLetterShapes);
        appCategories.add(appCategoryLetterShapes);


        // 04 Writing
        AppCategory appCategoryWriting = new AppCategory();
        appCategoryWriting.setName("Writing");
        List<AppGroup> appGroupsWriting = new ArrayList<>();
        appGroupsWriting.add(loadAppGroup(
                "no.leaplearning.literacy.drawing_line.fr",
                "no.leaplearning.literacy.how_to_write.fr",
                "com.alphabetking.literacy.trace",                             //MISSING for 7"
                "no.leaplearning.literacy.write.fr"
        ));
        appCategoryWriting.setAppGroups(appGroupsWriting);
        appCategories.add(appCategoryWriting);


        // 05 Blending
        AppCategory appCategoryBlending = new AppCategory();
        appCategoryBlending.setName("Blending");
        List<AppGroup> appGroupsBlending = new ArrayList<>();
        appGroupsBlending.add(loadAppGroup(
                "com.alphabetking.literacy.spelling_first_sound.fr",
                "com.alphabetking.literacy.spelling_last_sound.fr",
                "com.alphabetking.literacy.spelling_middle_sound.fr",
                "com.alphabetking.literacy.spelling_small_words.fr"
        ));
        appGroupsBlending.add(loadAppGroup(
                "com.alphabetking.literacy.spelling_small_words_2.fr",
                "com.alphabetking.literacy.spelling_sentences.fr",
                "com.alphabetking.literacy.spelling_vowels.fr",
                "com.alphabetking.literacy.split_the_word.fr"                          //MISSING for 7"
        ));
        appGroupsBlending.add(loadAppGroup(
                "com.alphabetking.literacy.puzzle_small_words.fr",
                "com.alphabetking.literacy.puzzle_blends.fr",
                "com.alphabetking.literacy.find_word_in_line.fr",
                "com.alphabetking.literacy.grid_small.fr",
                "com.alphabetking.literacy.grid_huge_word.fr"
        ));
        appCategoryBlending.setAppGroups(appGroupsBlending);
        appCategories.add(appCategoryBlending);


        // 06 Words
        AppCategory appCategoryWords = new AppCategory();
        appCategoryWords.setName("Mots");
        List<AppGroup> appGroupsWords = new ArrayList<>();
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.small_words.fr",
                "com.alphabetking.literacy.pronouns.fr",
                "com.alphabetking.literacy.word_puzzle.fr",
                "com.alphabetking.literacy.grid_sight_words.fr",
                "com.alphabetking.literacy.fast_reader.fr",
                "com.alphabetking.literacy.days_and_months.fr"
        ));
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.rooms_and_concepts.fr",
                "com.alphabetking.literacy.words.fr",
                "com.alphabetking.literacy.body_parts_african.fr",
                "com.alphabetking.literacy.record_word.fr",
                "com.alphabetking.literacy.correct_spelling.fr",
                "com.alphabetking.literacy.nouns_and_verbs.fr"
        ));
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.sort_text",
                "com.alphabetking.literacy.fake_or_real.fr",
                "com.alphabetking.literacy.parking_words.fr",
                "com.alphabetking.literacy.opposite.fr",
                "com.alphabetking.literacy.preposition.fr",
                "com.alphabetking.literacy.compare_colour.fr"
        ));
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.numbers.fr",
                "com.alphabetking.literacy.plural_nouns.fr",
                "com.alphabetking.literacy.size.fr"
        ));
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.memory_images",
                "com.alphabetking.literacy.memory_sound_image",
                "com.gmail.programmersimeon.memory_sound_word",
                "com.gmail.programmersimeon.memory_word_image",
                "com.gmail.programmersimeon.memory_word"
        ));
        appCategoryWords.setAppGroups(appGroupsWords);
        appCategories.add(appCategoryWords);


        // 07 Sentences
        AppCategory appCategorySentences = new AppCategory();
        appCategorySentences.setName("Phrases");
        List<AppGroup> appGroupsSentences = new ArrayList<>();
        appGroupsSentences.add(loadAppGroup(
                "no.leaplearning.literacy.verb_to_be.fr",
                "com.alphabetking.literacy.verbs.fr",
                "com.alphabetking.literacy.nouns.fr",
                "com.alphabetking.literacy.prepositions.fr",
                "com.alphabetking.literacy.questions.fr",
                "com.alphabetking.literacy.punctuation.fr"
        ));
        appGroupsSentences.add(loadAppGroup(
                "com.alphabetking.literacy.complete_the_sentence.fr",
                "com.alphabetking.literacy.match_sentences_1.fr",
                "com.alphabetking.literacy.match_sentences_2.fr",
                "com.alphabetking.literacy.match_sentences_3.fr",
                "com.alphabetking.literacy.match_sentences_4.fr",
                "com.alphabetking.literacy.colouring_book_2.fr"
        ));
        appGroupsSentences.add(loadAppGroup(
                "com.alphabetking.literacy.rooms_sentences.fr",
                "com.alphabetking.literacy.record_sentences.fr",
                "com.alphabetking.literacy.grid_sentences",
                "com.alphabetking.literacy.reading_comprehension.fr",
                "com.alphabetking.literacy.sequence_sentences.fr",
                "com.alphabetking.literacy.sight_word_sentence"
        ));
        appGroupsSentences.add(loadAppGroup(
                "com.alphabetking.literacy.make_sentences_1.fr",
                "com.alphabetking.literacy.make_sentences_2.fr",
                "com.alphabetking.literacy.make_sentences_3.fr",
                "com.alphabetking.literacy.sexual_abuse_complete",
                "com.alphabetking.literacy.sexual_abuse_mount"
        ));
        appCategorySentences.setAppGroups(appGroupsSentences);
        appCategories.add(appCategorySentences);


        // 08 Reading stories
        AppCategory appCategoryReadingStories = new AppCategory();
        appCategoryReadingStories.setName("Histoires");
        List<AppGroup> appGroupsReadingStories = new ArrayList<>();
        appGroupsReadingStories.add(loadAppGroup(
                "no.leaplearning.literacy.books_level_a.fr",
                "com.alphabetking.literacy.books_level_b.fr",
                "com.alphabetking.literacy.books_level_c.fr",
                "com.alphabetking.literacy.books_level_d.fr"
        ));
        appGroupsReadingStories.add(loadAppGroup(
                "com.alphabetking.literacy.mariama.fr",
                "com.alphabetking.literacy.mariama_and_mousa.fr",
                "com.alphabetking.literacy.mousa.fr"
        ));
        appGroupsReadingStories.add(loadAppGroup(
                "com.alphabetking.story.monkeys",
                "com.alphabetking.story.monkeys_2",
                "com.alphabetking.story.penguins",
                "com.alphabetking.story.the_hen"
        ));
        appCategoryReadingStories.setAppGroups(appGroupsReadingStories);
        appCategories.add(appCategoryReadingStories);

        // FILE MANAGER
        AppCategory appCategoryUtilities = new AppCategory();
        appCategoryUtilities.setName("Utilitaires");
        List<AppGroup> appGroupsUtilities = new ArrayList<>();
        appGroupsUtilities.add(loadAppGroup(
                "com.chaozhuo.filemanager"
        ));
        appCategoryUtilities.setAppGroups(appGroupsUtilities);
        appCategories.add(appCategoryUtilities);

/*
// 09 Numeracy
        AppCategory appCategoryNumeracy = new AppCategory();
        appCategoryNumeracy.setName("Numeracy");
        List<AppGroup> appGroupsNumeracy = new ArrayList<>();
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.color_squares",
                "com.alphabetking.logic.mirror_pattern",
                "com.alphabetking.logic.color_fractions",
                "com.alphabetking.numeracy.table",
                "com.alphabetking.numbers.quantity",
                "com.alphabetking.math.bigger_smaller"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.number.number_in_line",
                "com.alphabetking.number.find_the_number_missing",
                "com.alphabetking.number.find_the_number",
                "com.alphabetking.number.match_numbers",
                "com.alphabetking.number.sort_numbers"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.numbers.stacking",
                "com.alphabetking.numeracy.find_from_image"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.color_grid",
                "com.alphabetking.math.family_house",
                "com.alphabetking.numeracy.split_the_number",
                "com.alphabetking.math.ten_cross",
                "com.alphabetking.math.math_room_mix"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.addition",
                "com.alphabetking.math.sort_addition",
                "com.alphabetking.math.whats_missing_addition",
                "com.alphabetking.numeracy.compare_addition",
                "com.alphabetking.math.sort_plus"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.color_square_addition",
                "com.alphabetking.math.math_room_addition",
                "com.alphabetking.math.puzzle_addition",
                "com.alphabetking.math.matrix_addition"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.subtraction",
                "com.alphabetking.math.sort_subtraction",
                "com.alphabetking.math.whats_missing_subtraction",
                "com.alphabetking.numeracy.compare_substraction"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.math_room_subtraction",
                "com.alphabetking.math.puzzle_subtraction",
                "com.alphabetking.math.matrix_subtraction"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.multiplication",
                "com.alphabetking.math.sort_multiplication",
                "com.alphabetking.math.whats_missing_multiplication",
                "com.alphabetking.math.matrix_multiplication"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.divison"
        ));

        appCategoryNumeracy.setAppGroups(appGroupsNumeracy);
        appCategories.add(appCategoryNumeracy);
*/
/*
        // Test app
        AppCategory appCategoryTest = new AppCategory();
        appCategoryTest.setName("Test app");
        List<AppGroup> appGroupsTest = new ArrayList<>();

        appGroupsTest.add(loadAppGroup(
                "com.gmail.programmersimeon.test_app"
        ));
        appCategoryTest.setAppGroups(appGroupsTest);
        appCategories.add(appCategoryTest);
*/


        appCollection.setAppCategories(appCategories);

        return appCollection;
    }

    // TODO: fetch via Appstore library
    public static AppCollection loadAppCollectionNorwegian() {
        Log.i(AppCollectionGenerator.class.getName(), "loadAppCollectionNorwegian");

        AppCollection appCollection = new AppCollection();

        List<AppCategory> appCategories = new ArrayList<>();

        // 00 Logic
        AppCategory appCategoryLogic = new AppCategory();
        appCategoryLogic.setName("Logikk og begreper");
        List<AppGroup> appGroupsLogic = new ArrayList<>();

        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.find_colors.no",    // N
                "com.thealphabetking.logic.find_shape.no",  // N
                "com.alphabetking.logic.find_shadows.no",   // N
                "no.leaplearning.logic.find_section.no",
                "no.leaplearning.logic.front_and_back.no",
                "no.leaplearning.logic.mirror_pattern.no",  // N
                "no.leaplearning.logic.mirror_pattern"      // E in case NOR is missing
        ));        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.pattern.no",        // N
                "com.alphabetking.logic.whatshapefits.no",  // N
                "com.alphabetking.logic.find_pairs.no",     // N
                "com.alphabetking.logic.match_pairs.no",    // N
                "com.alphabetking.logic.find_fitting_shape.no",//N
                "com.alphabetking.logic.match_fitting_shape.no"//N
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.match_3_mix.no",    // N
                "com.alphabetking.logic.sequence.no",       // N
                "com.alphabetking.logic.matrix.no",         // N
                "no.leaplearning.logic.find_belong.no",
                "no.leaplearning.logic.match_belong.no",
                "com.alphabetking.logic.whatfits.no"       // N
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.puzzle_image.no",   // N
                "no.leaplearning.logic.find_opposite.no",
                "no.leaplearning.logic.match_opposite.no",
                "no.leaplearning.logic.find_senses.no",
                "no.leaplearning.logic.sort_it_out.no",     // N
                "com.alphabetking.logic.find_shape3d.no"   // N
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.time.no"           // N
        ));
        //appGroupsLogic.add(loadAppGroup(
        //        "com.gmail.programmersimeon.lag_bildekort",
        //        "com.gmail.bvalbo.NO_Finn___Yrker",
        //        "com.gmail.bvalbo.NO_Finn_lyden___Yrker",
        //        "com.bokstavkkongen.barnutd.FinnTrafikkskilt",
        //        "com.bokstavkongen.barnutd.finnlydentrafikkskilt"
        //));


/*

        appGroupsLogic.add(loadAppGroup(
                "com.gmail.programmersimeon.lag_bildekort"
        ));
*/
        appCategoryLogic.setAppGroups(appGroupsLogic);
        appCategories.add(appCategoryLogic);


        // 01 Letter sounds
        AppCategory appCategoryLetterSounds = new AppCategory();
        appCategoryLetterSounds.setName("Bokstavlyder");
        List<AppGroup> appGroupsLetterSounds = new ArrayList<>();
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.literacy.hva_rimer",
                "no.leaplearning.literacy.find_rhymes.no",
                "com.gmail.labs.gamebit.match_rimord",          // OLD bundle id
                "no.leaplearning.literacy.match_rhymes.no",
                "com.gmail.programmersimeon.match_rimord_lyd",
                "com.gmail.programmersimeon.stavelser",         // OLD bundle id
                "no.leaplearning.literacy.syllables_1.no",
                "com.gmail.programmersimeon.stavelser_2",       // OLD bundle id
                "no.leaplearning.literacy.syllables_2.no"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "com.bokstavkongen.barnutd.sorter_forste_lyd",
                "com.bokstavkongen.barnutd.sorter_siste_lyd",
                "com.bokstavkongen.barnutd.sorter_midtre_lyd",
                "com.bokstavkongen.barnutd.sorter_inneholder_lyden",
                "com.gmail.programmersimeon.match_forste_lyd",
                "com.gmail.programmersimeon.match_midtre_lyd"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "no.leaplearning.literacy.sound_small_words.no",
                "no.leaplearning.literacy.rebus_sounds.no",
                "no.leaplearning.literacy.sounding.no",
                "com.bokstavkongen.barnutd.forste_lyd",
                "no.leaplearning.literacy.find_vowels.no",
                "no.leaplearning.literacy.find_letter_name.no"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "no.leaplearning.literacy.first_sound_puzzle.no",
                "com.bokstavkongen.barnutd.finn_bokstaven", // OLD bundle id
                "com.alphabetking.literacy.find_letter.no",
                "com.bokstavkongen.barnutd.finn_bokstavlyden",             // OLD bundle id
                "com.alphabetking.literacy.find_letter_sound.no",
                "com.alphabetking.barnutd.match_bokstavlyder",
                "com.bokstavkongen.barnutd.matchBokstavnavn",
                "com.bokstavkongen.barnutd.bildekort_bokstavlyder"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "com.bokstavkongen.barnutd.husk_lydene",
                "com.bokstavkongen.barnutd.match_lyder",
                //"com.gmail.programmersimeon.bokstavlydene_med_bevegleser",
                "com.bokstavkongen.barnutd.music_video_no",
                "com.marit.Bokstavkongen"
        ));

        appCategoryLetterSounds.setAppGroups(appGroupsLetterSounds);
        appCategories.add(appCategoryLetterSounds);


        // 02 Listening to stories
        AppCategory appCategoryListeningToStories = new AppCategory();
        appCategoryListeningToStories.setName("Lytte til historier");
        List<AppGroup> appGroupsListeningToStories = new ArrayList<>();
        appGroupsListeningToStories.add(loadAppGroup(
                "no.leaplearning.literacy.books_level_a_auto.no",
                "no.leaplearning.literacy.books_level_b_auto.no",
                "no.leaplearning.literacy.books_level_c_auto.no",
                "no.leaplearning.literacy.books_level_d_auto.no"
        ));
        appGroupsListeningToStories.add(loadAppGroup(
                "no.leaplearning.literacy.mariama_auto.no",
                "no.leaplearning.literacy.mariama_and_mousa_auto.no",
                "no.leaplearning.literacy.mousa_auto.no",
                "no.leaplearning.literacy.monkeys_auto.no",
                "no.leaplearning.literacy.monkeys_2_auto.no"
        ));
        appGroupsListeningToStories.add(loadAppGroup(
                "no.leaplearning.literacy.penguins_auto.no",
                "no.leaplearning.literacy.the_hen_auto.no",
                "com.alphabetking.literacy.story_ak.no"
        ));
        appCategoryListeningToStories.setAppGroups(appGroupsListeningToStories);
        appCategories.add(appCategoryListeningToStories);


        // 03 Letter shapes
        AppCategory appCategoryLetterShapes = new AppCategory();
        appCategoryLetterShapes.setName("Bokstavformer");
        List<AppGroup> appGroupsLetterShapes = new ArrayList<>();
        appGroupsLetterShapes.add(loadAppGroup(
                "com.bokstavkongen.barnutd.bokstaver_i_bildet",
                "com.bokstavkongen.barnutd.bokstaver_i_rutenett",
                "com.bokstavkongen.barnutd.pusle_alfabetet",
                "no.leaplearning.literacy.puzzle.no",
                "no.leaplearning.literacy.parking_letters.no"
        ));
        appGroupsLetterShapes.add(loadAppGroup(
                "no.leaplearning.literacy.paint.no",
                "no.leaplearning.literacy.match_capital_letters.no",
                "no.leaplearning.literacy.match_small_letters.no",
                "no.leaplearning.literacy.match_mixed_letters.no",
                "no.leaplearning.literacy.match_letters_words.no",
                "no.leaplearning.literacy.memory_letters.no"
        ));
        appGroupsLetterShapes.add(loadAppGroup(
                "com.bokstavkongen.barnutd.alfabetisk_rekkefolge",
                "com.bokstavkongen.barnutd.alfabetisk_rekkefolge",
                "com.bokstavkongen.barnutd.alfabetisk_rekkefolge_to",
                "com.bokstavkongen.barnutd.alfabetisk_rekkefolge_tre"
        ));
        appCategoryLetterShapes.setAppGroups(appGroupsLetterShapes);
        appCategories.add(appCategoryLetterShapes);


        // 04 Writing
        AppCategory appCategoryWriting = new AppCategory();
        appCategoryWriting.setName("Skrive");
        List<AppGroup> appGroupsWriting = new ArrayList<>();
        appGroupsWriting.add(loadAppGroup(
                "no.leaplearning.literacy.drawing_line.no",
                "com.alphabetking.literacy.how_to_write",
                "com.bokstavkongen.barnutd.skrive"
        ));
        appCategoryWriting.setAppGroups(appGroupsWriting);
        appCategories.add(appCategoryWriting);


        // 05 Blending
        AppCategory appCategoryBlending = new AppCategory();
        appCategoryBlending.setName("Stave");
        List<AppGroup> appGroupsBlending = new ArrayList<>();
        appGroupsBlending.add(loadAppGroup(
                "com.bokstavkongen.barnutd.stave_forste_lyd", // OLD bunlde id
                "com.alphabetking.literacy.spelling_first_sound.no",
                "com.bokstavkongen.barnutd.stave_siste_lyd",                 // OLD bundle id
                "com.alphabetking.literacy.spelling_last_sound.no",
                "com.bokstavkongen.barnutd.stave_midtre_lyd",                // OLD bundle id
                "com.alphabetking.literacy.spelling_middle_sound.no",
                "com.bokstavkongen.barnutd.stave_smaord_1"
        ));
        appGroupsBlending.add(loadAppGroup(
                "com.bokstavkongen.barnutd.stave_smaord_2",
                "com.bokstavkongen.barnutd.stave_setninger",
                "no.leaplearning.literacy.splitt_ordet.no"
        ));
        appGroupsBlending.add(loadAppGroup(
                "com.bokstavkongen.barnutd.pusle_smaord",
                "com.alphabetking.literacy.find_word_in_line.no",
                "no.leaplearning.literacy.stave_vokaler.no",
                "com.bokstavkongen.barnutd.ord_i_rutenett"
        ));
        appCategoryBlending.setAppGroups(appGroupsBlending);
        appCategories.add(appCategoryBlending);


        // 06 Words
        AppCategory appCategoryWords = new AppCategory();
        appCategoryWords.setName("Ord og ordbilder");
        List<AppGroup> appGroupsWords = new ArrayList<>();
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.small_words.no",
                "no.leaplearning.literacy.pronouns.no",
                "com.alphabetking.literacy.pronouns.no",
                "com.alphabetking.logic.word_puzzle.no",        // wrong bundle id
                "com.alphabetking.literacy.word_puzzle.no",
                "com.bokstavkongen.barnutd.hoyfrekvente_ord",
                "com.bokstavkongen.barnutd.hurtigleseren",
                "com.alphabetking.logic.days_and_months.no",    // wrong bundle id
                "com.alphabetking.literacy.days_and_months.no"
        ));
        appGroupsWords.add(loadAppGroup(
                "com.bokstavkongen.barnutd.rom",
                "com.bokstavkongen.barnutd.ord",
                "com.bokstavkongen.barnutd.kroppen",
                //"com.bokstavkongen.barnutd.kroppen_afrikansk",
                "com.alphabetking.literacy.record_words.no",
                "com.alphabetking.literacy.correct_spelling.no"
        ));
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.sort_text.no",
                "no.leaplearning.literacy.fake_or_real.no",
                "com.bokstavkongen.barnutd.morfemer",
                "com.alphabetking.literacy.parking_words.no",
                "com.alphabetking.literacy.opposite.no",
                "com.alphabetking.literacy.preposition.no"
        ));
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.nouns_and_verbs.no",
                "com.alphabetking.literacy.compare_colour.no",
                "com.alphabetking.literacy.synonyms.no",
                "com.alphabetking.literacy.numbers.no",
                "com.alphabetking.literacy.plural_nouns.no",
                "com.alphabetking.literacy.size.no"
        ));
        appGroupsWords.add(loadAppGroup(
                "com.bokstavkongen.barnutd.match_bilde_ord",
                "com.bokstavkongen.barnutd.match_ord_ord",
                "com.bokstavkongen.barnutd.match_ord",
                "com.bokstavkongen.barnutd.match_lyd_ord"
        ));
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.memory_images.no",
                "com.alphabetking.literacy.memory_sound_word.no",
                "com.alphabetking.literacy.memory_image_word.no",
                "com.alphabetking.literacy.memory_words.no"
        ));
        appCategoryWords.setAppGroups(appGroupsWords);
        appCategories.add(appCategoryWords);


        // 07 Sentences
        AppCategory appCategorySentences = new AppCategory();
        appCategorySentences.setName("Setninger og leseforståelse");
        List<AppGroup> appGroupsSentences = new ArrayList<>();

        appGroupsSentences.add(loadAppGroup(
                "no.leaplearning.literacy.verbs.no",
                "no.leaplearning.literacy.nouns.no",
                "no.leaplearning.literacy.prepositions.no",
                "no.leaplearning.literacy.questions.no",
                "no.leaplearning.literacy.punctuation.no"
        ));
        appGroupsSentences.add(loadAppGroup(
                "no.leaplearning.literacy.complete_the_sentence.no",
                "no.leaplearning.literacy.match_sentences_1.no",
                "no.leaplearning.literacy.match_sentences_2.no",
                "no.leaplearning.literacy.match_sentences_3.no",
                "no.leaplearning.literacy.match_sentences_4.no",
                "com.bokstavkongen.barnutd.fargelegg_svaret"
        ));
        appGroupsSentences.add(loadAppGroup(
                "no.leaplearning.literacy.rooms_sentences.no",
                "no.leaplearning.literacy.record_sentences.no",
                "com.bokstavkongen.barnutd.setninger_i_rutenett",
                "no.leaplearning.literacy.reading_comprehension.no",
                "no.leaplearning.literacy.sequence_sentences.no",
                "no.leaplearning.literacy.sight_word_sentences.no"
        ));
        appGroupsSentences.add(loadAppGroup(
                //"com.bokstavkongen.barnutd.lag_setninger",// GAMMEL - skal bort
                "no.leaplearning.literacy.make_sentences_1.no",
                "no.leaplearning.literacy.make_sentences_2.no",
                "no.leaplearning.literacy.make_sentences_3.no",
                "no.leaplearning.literacy.abuse_complete.no",
                "no.leaplearning.literacy.abuse_make.no",
                "no.leaplearning.literacy.find_reading_comprehension.no"
        ));
       appGroupsSentences.add(loadAppGroup(
                "com.bokstavkongen.barnutd.NNmatchSetningar"
        ));
        appCategorySentences.setAppGroups(appGroupsSentences);
        appCategories.add(appCategorySentences);


        // 08 Reading stories
        AppCategory appCategoryReadingStories = new AppCategory();
        appCategoryReadingStories.setName("Lese historier");
        List<AppGroup> appGroupsReadingStories = new ArrayList<>();
        appGroupsReadingStories.add(loadAppGroup(
                "no.leaplearning.literacy.books_level_a.no",
                "no.leaplearning.literacy.books_level_b.no"
        ));
//        appGroupsReadingStories.add(loadAppGroup(
//                //package-ids
//        ));
//        appGroupsReadingStories.add(loadAppGroup(
//                //package-ids
//        ));
        appCategoryReadingStories.setAppGroups(appGroupsReadingStories);
        appCategories.add(appCategoryReadingStories);

/*
        // 09 Numeracy
        AppCategory appCategoryNumeracy = new AppCategory();
        appCategoryNumeracy.setName("Matematikk");
        List<AppGroup> appGroupsNumeracy = new ArrayList<>();
        appGroupsNumeracy.add(loadAppGroup(
                "com.bokstavkongen.barnutd.tall_linje",
                "com.bokstavkongen.barnutd.tallet_som_mangler"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.bokstavkongen.barnutd.finn_tallet",
                "com.bokstavkongen.barnutd.storre_eller_mindre"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.logic.find_correct_size.no"
        ));
        appCategoryNumeracy.setAppGroups(appGroupsNumeracy);
        appCategories.add(appCategoryNumeracy);


// 09 Numeracy
        AppCategory appCategoryNumeracy = new AppCategory();
        appCategoryNumeracy.setName("Numeracy");
        List<AppGroup> appGroupsNumeracy = new ArrayList<>();
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.color_squares",
                "com.alphabetking.logic.mirror_pattern",
                "com.alphabetking.logic.color_fractions",
                "com.alphabetking.numeracy.table",
                "com.alphabetking.numbers.quantity",
                "com.alphabetking.math.bigger_smaller"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.number.number_in_line",
                "com.alphabetking.number.find_the_number_missing",
                "com.alphabetking.number.find_the_number",
                "com.alphabetking.number.match_numbers",
                "com.alphabetking.number.sort_numbers"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.numbers.stacking",
                "com.alphabetking.numeracy.find_from_image"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.color_grid",
                "com.alphabetking.math.family_house",
                "com.alphabetking.numeracy.split_the_number",
                "com.alphabetking.math.ten_cross",
                "com.alphabetking.math.math_room_mix"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.addition",
                "com.alphabetking.math.sort_addition",
                "com.alphabetking.math.whats_missing_addition",
                "com.alphabetking.numeracy.compare_addition",
                "com.alphabetking.math.sort_plus"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.color_square_addition",
                "com.alphabetking.math.math_room_addition",
                "com.alphabetking.math.puzzle_addition",
                "com.alphabetking.math.matrix_addition"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.subtraction",
                "com.alphabetking.math.sort_subtraction",
                "com.alphabetking.math.whats_missing_subtraction",
                "com.alphabetking.numeracy.compare_substraction"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.math_room_subtraction",
                "com.alphabetking.math.puzzle_subtraction",
                "com.alphabetking.math.matrix_subtraction"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.multiplication",
                "com.alphabetking.math.sort_multiplication",
                "com.alphabetking.math.whats_missing_multiplication",
                "com.alphabetking.math.matrix_multiplication"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.divison"
        ));


        appCategoryNumeracy.setAppGroups(appGroupsNumeracy);
        appCategories.add(appCategoryNumeracy);
*/


/*
        // 09 Numeracy
        AppCategory appCategoryNumeracy = new AppCategory();
        appCategoryNumeracy.setName("Matematikk");
        List<AppGroup> appGroupsNumeracy = new ArrayList<>();
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.numeracy.colour_squares",
                "com.alphabetking.numeracy.quantity",
                "com.alphabetking.number.find_the_number",
                //"com.alphabetking.number.match_numbers",    // old
                //"com.alphabetking.numeracy.sort_numbers",    // old
                "com.alphabetking.numeracy.number_in_line"
                //"com.alphabetking.number.find_the_number_missing"   //old
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.numeracy.whats_missing_addition",
                "com.alphabetking.numeracy.matrix_addition",
                "com.alphabetking.numeracy.colour_squares_addition",
                "com.alphabetking.numeracy.rainbow"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.numeracy.rooms_addition",
                "com.alphabetking.numeracy.sort_it_plus",
                "com.alphabetking.numeracy.fast_reader_addition"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.numeracy.subtraction",
                "com.alphabetking.numeracy.matrix_subtraction",
                "com.alphabetking.com.numeracy.rooms_subtraction",
                "com.alphabetking.numeracy.fast_reader_subtraction"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.numeracy.multiplication",
                "com.alphabetking.numeracy.whats_missing_multiplication",
                "com.alphabetking.numeracy.multiplication_table",
                "com.alphabetking.numeracy.matrix_multiplication",
                "com.alphabetking.numeracy.multiplication_numbers",
                "com.alphabetking.numeracy.fast_reader_multiplication"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.numeracy.division"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.numeracy.stacking",
                "com.alphabetking.numeracy.ten_cross",
                "com.alphabetking.numeracy.family_house",
                "com.alphabetking.numeracy.rooms_mix"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.numeracy.table",
                "com.alphabetking.numeracy.bigger_smaller",
                "com.alphabetking.numeracy.ruler",
                "com.alphabetking.numeracy.colour_fractions"
        ));
        appCategoryNumeracy.setAppGroups(appGroupsNumeracy);
        appCategories.add(appCategoryNumeracy);
*/

        appCollection.setAppCategories(appCategories);

        return appCollection;
    }

    // TODO: fetch via Appstore library
    public static AppCollection loadAppCollectionPortuguese() {
        Log.i(AppCollectionGenerator.class.getName(), "loadAppCollectionPortuguese");

        AppCollection appCollection = new AppCollection();

        List<AppCategory> appCategories = new ArrayList<>();

        // THEMATIC: Oral hygiene
        AppCategory appCategoryOralHygiene = new AppCategory();
        appCategoryOralHygiene.setName("Higiene bucal");
        List<AppGroup> appGroupsOralHygiene = new ArrayList<>();

        appGroupsOralHygiene.add(loadAppGroup(
                "com.alphabetking.literacy.sort_dental.pt",
                "com.alphabetking.literacy.reading_dental.pt",
                "com.alphabetking.literacy.complete_dental.pt",
                "com.alphabetking.literacy.makesentence_dental.pt",
                "com.alphabetking.literacy.story_dental.pt"
        ));

        appCategoryOralHygiene.setAppGroups(appGroupsOralHygiene);
        appCategories.add(appCategoryOralHygiene);


        // THEMATIC: Sexual abuse
        AppCategory appCategorySexualAbuse = new AppCategory();
        appCategorySexualAbuse.setName("Abuso sexual");
        List<AppGroup> appGroupsSexualAbuse = new ArrayList<>();

        appGroupsSexualAbuse.add(loadAppGroup(
                "com.alphabetking.literacy.sort_abuse.pt",
                "com.alphabetking.literacy.reading_abuse.pt",
                "com.alphabetking.literacy.complete_abuse.pt",
                "com.alphabetking.literacy.makesentence_abuse.pt",
                "com.alphabetking.literacy.story_abuse.pt"
        ));

        appCategorySexualAbuse.setAppGroups(appGroupsSexualAbuse);
        appCategories.add(appCategorySexualAbuse);


        // THEMATIC: Rights and responsibilities
        AppCategory appCategoryRightsAndResponsibilities = new AppCategory();
        appCategoryRightsAndResponsibilities.setName("Direitos e responsabilidades");
        List<AppGroup> appGroupsRightsAndResponsibilities = new ArrayList<>();

        appGroupsRightsAndResponsibilities.add(loadAppGroup(
                "com.alphabetking.literacy.sort_rights.pt",
                "com.alphabetking.literacy.reading_rights.pt",
                "com.alphabetking.literacy.complete_rights.pt",
                "com.alphabetking.literacy.makesentence_rights.pt",
                "com.alphabetking.literacy.story_rights.pt"
        ));

        appCategoryRightsAndResponsibilities.setAppGroups(appGroupsRightsAndResponsibilities);
        appCategories.add(appCategoryRightsAndResponsibilities);


        // THEMATIC: Good Citizenship
        AppCategory appCategoryGoodCitizenship = new AppCategory();
        appCategoryGoodCitizenship.setName("Cidadania e meio ambiente");
        List<AppGroup> appGroupsGoodCitizenship = new ArrayList<>();

        appGroupsGoodCitizenship.add(loadAppGroup(
                "com.alphabetking.literacy.sort_citizen.pt",
                "com.alphabetking.literacy.reading_citizen.pt",
                "com.alphabetking.literacy.complete_citizen.pt",
                "com.alphabetking.literacy.makesentence_citizen.pt",
                "com.alphabetking.literacy.story_citizen.pt"
        ));

        appCategoryGoodCitizenship.setAppGroups(appGroupsGoodCitizenship);
        appCategories.add(appCategoryGoodCitizenship);


        // THEMATIC: Health
        AppCategory appCategoryHealth = new AppCategory();
        appCategoryHealth.setName("Saúde");
        List<AppGroup> appGroupsHealth = new ArrayList<>();

        appGroupsHealth.add(loadAppGroup(
                "com.alphabetking.literacy.sort_health.pt",
                "com.alphabetking.literacy.story_health.pt"
        ));

        appCategoryHealth.setAppGroups(appGroupsHealth);
        appCategories.add(appCategoryHealth);


        // 00 Logic
        AppCategory appCategoryLogic = new AppCategory();
        appCategoryLogic.setName("Lógica");
        List<AppGroup> appGroupsLogic = new ArrayList<>();
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.find_colors",
                //"com.alphabetking.logic.find_shape",
                "com.thealphabetking.kidsedu.find_shape",
                "com.alphabetking.logic.find_shadows",
                "com.alphabetking.logic.find_section",
                "com.alphabetking.logic.pairs_font_and_back"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.pattern",
                "com.alphabetking.logic.whatshapefits",
                //    "com.gmail.bvalbo.PT_Encontrar___Pares",    // PT
                //    "com.alphabetking.logic.find_pairs.pt",     // PT
                //    "com.gmail.bvalbo.PT_Combinar___Pares",     // PT
                //    "com.alphabetking.logic.match_pairs.pt",    // PT
                "com.alphabetking.logic.find_pairs",
                "com.alphabetking.logic.match_pairs",
                "com.alphabetking.logic.find_fitting_shape",
                "com.alphabetking.logic.match_fitting_shape"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.match_3_mix",
                "com.alphabetking.logic.sequence",
                "com.alphabetking.logic.matrix",
                "com.alphabetking.logic.match_belong",
                //    "com.gmail.bvalbo.O_proximo___Tema",        // PT
                //    "com.alphabetking.logic.whatfits.pt",       // PT
                "com.alphabetking.logic.whatfits"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.puzzle_image",
                //    "com.gmail.bvalbo.PT_Encontrar___Oposto",   // PT
                //    "com.alphabetking.logic.find_opposite.pt",  // PT
                //    "com.gmail.bvalbo.PT_Combinar___Opostos",   // PT
                //    "com.alphabetking.logic.match_opposite.pt", // PT
                "com.alphabetking.logic.find_opposite",
                "com.alphabetking.logic.match_opposite",
                "com.alphabetking.logic.find_senses",
                "com.alphabetking.literacy.sort_it_out",
                "com.alphabetking.logic.time"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.literacy.sort_dental.pt",
                "com.alphabetking.literacy.sort_abuse.pt",
                "com.alphabetking.literacy.sort_rights.pt",
                "com.alphabetking.literacy.sort_citizen.pt",
                "com.alphabetking.literacy.sort_health.pt"
        ));
        appCategoryLogic.setAppGroups(appGroupsLogic);
        appCategories.add(appCategoryLogic);

/*
        // 00 Logic
        AppCategory appCategoryLogic = new AppCategory();
        appCategoryLogic.setName("Lógica");
        List<AppGroup> appGroupsLogic = new ArrayList<>();

        appGroupsLogic.add(loadAppGroup(
                "com.gmail.bvalbo.PT_Encontrar___Pares",
                "com.alphabetking.logic.find_pairs.pt",
                "com.gmail.bvalbo.PT_Combinar___Pares",
                "com.alphabetking.logic.match_pairs.pt"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.gmail.bvalbo.O_proximo___Tema",
                "com.alphabetking.logic.whatfits.pt"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.gmail.bvalbo.PT_Encontrar___Oposto",
                "com.alphabetking.logic.find_opposite.pt",
                "com.gmail.bvalbo.PT_Combinar___Opostos",
                "com.alphabetking.logic.match_opposite.pt"
        ));

        appCategoryLogic.setAppGroups(appGroupsLogic);
        appCategories.add(appCategoryLogic);
*/

        // 01 Letter sounds
        AppCategory appCategoryLetterSounds = new AppCategory();
        appCategoryLetterSounds.setName("Sons de letra");
        List<AppGroup> appGroupsLetterSounds = new ArrayList<>();

        appGroupsLetterSounds.add(loadAppGroup(
                "com.gmail.bvalbo.PT_Combinar___Rimas",
                "com.alphabetking.literacy.match_rhymes.pt",
                "com.gmail.bvalbo.PT_Cata_palavras",
                "com.alphabetking.literacy.sort_sound.pt",
                "com.alphabetking.literacy.sort_first_sound",
                "com.alphabetking.literacy.sort_last_sound",
                "com.alphabetking.literacy.sort_middle_sound"
        ));

        appCategoryLetterSounds.setAppGroups(appGroupsLetterSounds);
        appCategories.add(appCategoryLetterSounds);


/*
        // 02 Listening to stories
        AppCategory appCategoryListeningToStories = new AppCategory();
        appCategoryListeningToStories.setName("Sheeko dhagaysi");
        List<AppGroup> appGroupsListeningToStories = new ArrayList<>();
        appGroupsListeningToStories.add(loadAppGroup(

        ));
        appGroupsListeningToStories.add(loadAppGroup(

        ));
        appGroupsListeningToStories.add(loadAppGroup(

        ));
        appCategoryListeningToStories.setAppGroups(appGroupsListeningToStories);
        appCategories.add(appCategoryListeningToStories);


        // 03 Letter shapes
        AppCategory appCategoryLetterShapes = new AppCategory();
        appCategoryLetterShapes.setName("Qaababka xarfaha");
        List<AppGroup> appGroupsLetterShapes = new ArrayList<>();
        appGroupsLetterShapes.add(loadAppGroup(

        ));
        appGroupsLetterShapes.add(loadAppGroup(

        ));
        appGroupsLetterShapes.add(loadAppGroup(

        ));
        appGroupsLetterShapes.add(loadAppGroup(

        ));
        appCategoryLetterShapes.setAppGroups(appGroupsLetterShapes);
        appCategories.add(appCategoryLetterShapes);


        // 04 Writing
        AppCategory appCategoryWriting = new AppCategory();
        appCategoryWriting.setName("Dhigaal");
        List<AppGroup> appGroupsWriting = new ArrayList<>();
        appGroupsWriting.add(loadAppGroup(

        ));
        appCategoryWriting.setAppGroups(appGroupsWriting);
        appCategories.add(appCategoryWriting);
*/

// 05 Blending
        AppCategory appCategoryBlending = new AppCategory();
        appCategoryBlending.setName("Misturando sons");
        List<AppGroup> appGroupsBlending = new ArrayList<>();
        appGroupsBlending.add(loadAppGroup(
                "com.alphabetking.literacy.spelling_first_sound.pt",
                "com.alphabetking.literacy.spelling_last_sound.pt",
                "com.alphabetking.literacy.spelling_middle_sound.pt",
                "com.alphabetking.literacy.spelling_small_words.pt"
        ));
        appGroupsBlending.add(loadAppGroup(
                "com.alphabetking.literacy.spelling2.pt",
                "com.gmail.bvalbo.PT_Quebra_palavras",
                "com.alphabetking.literacy.puzzle_words.pt",
                "com.alphabetking.literacy.puzzle_words_2.pt"
        ));
        appCategoryBlending.setAppGroups(appGroupsBlending);
        appCategories.add(appCategoryBlending);


        // 06 Words
        AppCategory appCategoryWords = new AppCategory();
        appCategoryWords.setName("Palavras");
        List<AppGroup> appGroupsWords = new ArrayList<>();

        appGroupsWords.add(loadAppGroup(
                "com.gmail.bvalbo.PT_Palavras_curtas",
                "com.alphabetking.literacy.small_words.pt",
                "com.alphabetking.literacy.room_and_concepts.pt",
                "com.gmail.bvalbo.PT_Words",
                "com.alphabetking.literacy.words.pt",
                "com.alphabetking.literacy.body_parts.pt"
        ));

        appCategoryWords.setAppGroups(appGroupsWords);
        appCategories.add(appCategoryWords);


        // 07 Sentences
        AppCategory appCategorySentences = new AppCategory();
        appCategorySentences.setName("Frases");
        List<AppGroup> appGroupsSentences = new ArrayList<>();

        appGroupsSentences.add(loadAppGroup(
                "com.gmail.bvalbo.PT_Complete_a_frase",
                "com.alphabetking.literacy.complete_sentence.pt"
        ));
        appGroupsSentences.add(loadAppGroup(
                "com.alphabetking.literacy.reading_dental.pt",
                "com.alphabetking.literacy.reading_abuse.pt",
                "com.alphabetking.literacy.reading_rights.pt",
                "com.alphabetking.literacy.reading_citizen.pt"
        ));
        appGroupsSentences.add(loadAppGroup(
                "com.alphabetking.literacy.complete_dental.pt",
                "com.alphabetking.literacy.complete_abuse.pt",
                "com.alphabetking.literacy.complete_rights.pt",
                "com.alphabetking.literacy.complete_citizen.pt"
        ));
        appGroupsSentences.add(loadAppGroup(
                "com.alphabetking.literacy.makesentence_dental.pt",
                "com.alphabetking.literacy.makesentence_abuse.pt",
                "com.alphabetking.literacy.makesentence_rights.pt",
                "com.alphabetking.literacy.makesentence_citizen.pt"
        ));

        appCategorySentences.setAppGroups(appGroupsSentences);
        appCategories.add(appCategorySentences);


        // 08 Reading stories
        AppCategory appCategoryReadingStories = new AppCategory();
        appCategoryReadingStories.setName("Histórias");
        List<AppGroup> appGroupsReadingStories = new ArrayList<>();
        appGroupsReadingStories.add(loadAppGroup(
                "com.alphabetking.literacy.story_dental.pt",
                "com.alphabetking.literacy.story_abuse.pt",
                "com.alphabetking.literacy.story_rights.pt",
                "com.alphabetking.literacy.story_citizen.pt",
                "com.alphabetking.literacy.story_health.pt"
        ));
        appCategoryReadingStories.setAppGroups(appGroupsReadingStories);
        appCategories.add(appCategoryReadingStories);


//        // 09 Numeracy
//        AppCategory appCategoryNumeracy = new AppCategory();
//        appCategoryNumeracy.setName("Tirinta");
//        List<AppGroup> appGroupsNumeracy = new ArrayList<>();
//        appGroupsNumeracy.add(loadAppGroup(
//                "..."
//        ));
//        appGroupsNumeracy.add(loadAppGroup(
//                "..."
//        ));
//        appCategoryNumeracy.setAppGroups(appGroupsNumeracy);
//        appCategories.add(appCategoryNumeracy);
/*
        // 09 Numeracy
        AppCategory appCategoryNumeracy = new AppCategory();
        appCategoryNumeracy.setName("Tirinta");
        List<AppGroup> appGroupsNumeracy = new ArrayList<>();
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.logic.mirror_pattern",
                "com.alphabetking.logic.color_fractions",
                "com.bokstavkongen.barnutd.tall_linje",
                "com.bokstavkongen.barnutd.storre_eller_mindre",
                "com.alphabetking.numbers.quantity",
                "com.alphabetking.number.find_the_number_missing",
                "com.alphabetking.number.find_the_number",
                "com.alphabetking.number.match_numbers",
                "com.alphabetking.number.sort_numbers"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.addition",
                "com.alphabetking.math.sort_addition",
                "com.alphabetking.math.math_room_addition",
                "com.alphabetking.math.puzzle_addition"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.subtraction",
                "com.alphabetking.math.sort_subtraction",
                "com.alphabetking.math.math_room_subtraction",
                "com.alphabetking.math.puzzle_subtraction",
                "com.alphabetking.math.whats_missing_subtraction"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.thealphabetking.kidsedu.math_multiplication",
                "com.alphabetking.math.sort_multiplication",
                "com.alphabetking.math.whats_missing_multiplication"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.thealphabetking.kidsedu.math_divison",
                "com.alphabetking.math.math_room_mix"
        ));
        appCategoryNumeracy.setAppGroups(appGroupsNumeracy);
        appCategories.add(appCategoryNumeracy);
*/

        appCollection.setAppCategories(appCategories);

        return appCollection;
    }

    // TODO: fetch via Appstore library
    public static AppCollection loadAppCollectionSomali() {
        Log.i(AppCollectionGenerator.class.getName(), "loadAppCollectionSomali");

        AppCollection appCollection = new AppCollection();

        List<AppCategory> appCategories = new ArrayList<>();


        // 00 Logic
        AppCategory appCategoryLogic = new AppCategory();
        appCategoryLogic.setName("Caqligal");
        List<AppGroup> appGroupsLogic = new ArrayList<>();
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.find_colors.so",            // S
                "com.thealphabetking.kidsedu.find_shape",
                "com.alphabetking.logic.find_shadows.so",                       // S
                "com.alphabetking.logic.find_section",
                "com.alphabetking.logic.pairs_font_and_back",
                "no.leaplearning.logic.mirror_pattern"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.make_pattern.so",       // S
                "com.alphabetking.logic.what_shape_fits.so",                    // S
                "com.alphabetking.logic.find_pairs.so",                         // S
                "com.alphabetking.logic.match_pairs.so",                        // S
                "com.alphabetking.logic.find_missing_part.so",                  // S
                "com.alphabetking.logic.match_missing_part.so"                  // S
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.match_3_mix.so",        // S
                "com.alphabetking.logic.sequence.so",                           // S
                "com.alphabetking.logic.matrix.so",                             // S
                "com.alphabetking.logic.match_belong",
                "com.alphabetking.logic.what_fits.so",                           // S
                "com.alphabetking.logic.find_3d_shapes"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.puzzle_image.so",       // S
                "com.alphabetking.logic.find_opposite",
                "com.alphabetking.logic.match_opposite",
                "com.alphabetking.logic.find_senses",
                "com.alphabetking.logic.sort_it_out.so",                         // S
                "com.alphabetking.logic.find_shape_mix"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.time"
        ));
        appCategoryLogic.setAppGroups(appGroupsLogic);
        appCategories.add(appCategoryLogic);


        // 01 Letter sounds
        AppCategory appCategoryLetterSounds = new AppCategory();
        appCategoryLetterSounds.setName("Dhawaaqa xarfaha");
        List<AppGroup> appGroupsLetterSounds = new ArrayList<>();
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.literacy.find_rhymes.so",
                "com.alphabetking.literacy.pairs_rhymes.so",
                "com.alphabetking.literacy.memory_rhymes.so",       // not made
                "com.alphabetking.literacy.syllables_1.so",
                "com.alphabetking.literacy.syllables_2.so",
                "com.alphabetking.literacy.pairs_syllables.so"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.literacy.sort_first_sound.so",
                "com.alphabetking.literacy.sort_last_sound.so",
                "com.alphabetking.literacy.sort_middle_sound.so",
                "com.alphabetking.literacy.sort_contains_sound.so", // not made
                "com.alphabetking.literacy.sound_small_words.so",
                "com.alphabetking.literacy.sounding.so"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.literacy.first_sound_puzzle.so",
                "com.alphabetking.literacy.find_letter.so",
                "com.alphabetking.literacy.find_letter_sound.so",
                "com.alphabetking.literacy.find_letter_name.so",
                "com.alphabetking.literacy.starting_sound_puzzle.so",   // not mad
                "com.alphabetking.literacy.find_vowels.so",
                "com.alphabetking.literacy.sort_vowels.so"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.literacy.remember_sounds.so",
                "com.alphabetking.literacy.match_blends.so",
                "com.alphabetking.literacy.rebus_sounds.so",
                "com.alphabetking.literacy.how_to_say.so",
                "com.alphabetking.literacy.flashcard_alphabet.so",
                "com.thealphabetking.kidsedu.music_video"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.literacy.flash_card.so",
                "com.alphabetking.literacy.flash_cards_letter_sounds.so",
                "com.alphabetking.literacy.flash_cards_starting_sound.so",
                "com.alphabetking.literacy.flash_cards_vowels.so",
                "com.alphabetking.literacy.memory_sounds.so",
                "com.alphabetking.literacy.memory_letters_sounds.so"
        ));
        appGroupsLetterSounds.add(loadAppGroup(
                "com.alphabetking.literacy.he-she-it.so"
        ));
        appCategoryLetterSounds.setAppGroups(appGroupsLetterSounds);
        appCategories.add(appCategoryLetterSounds);


        // 02 Listening to stories
        AppCategory appCategoryListeningToStories = new AppCategory();
        appCategoryListeningToStories.setName("Sheeko dhagaysi");
        List<AppGroup> appGroupsListeningToStories = new ArrayList<>();
        appGroupsListeningToStories.add(loadAppGroup(
                "com.alphabetking.story.level_a_auto.so",
                "com.alphabetking.story.level_b_auto.so",
                "com.alphabetking.literacy.story.level_b_auto.so",
                "com.alphabetking.literacy.books_level_c_auto.so",
                "com.alphabetking.literacy.books_level_d_auto.so"
        ));
        appGroupsListeningToStories.add(loadAppGroup(
                "com.alphabetking.literacy.mariama_auto.so",
                "com.alphabetking.literacy.mariama_and_mousa_auto.so",
                "com.alphabetking.literacy.mousa_auto.so"
        ));
        appGroupsListeningToStories.add(loadAppGroup(
                "com.alphabetking.literacy.monkeys_auto.so",
                "com.alphabetking.literacy.monkeys_2_auto.so",
                "com.alphabetking.literacy.penguins_auto.so",
                "com.alphabetking.literacy.the_hen_auto.so"
        ));
        appCategoryListeningToStories.setAppGroups(appGroupsListeningToStories);
        appCategories.add(appCategoryListeningToStories);


        // 03 Letter shapes
        AppCategory appCategoryLetterShapes = new AppCategory();
        appCategoryLetterShapes.setName("Qaababka xarfaha");
        List<AppGroup> appGroupsLetterShapes = new ArrayList<>();
        appGroupsLetterShapes.add(loadAppGroup(
                "com.alphabetking.literacy.find_letter_in_image.so",
                "com.alphabetking.literacy.letters_in_grid.so",
                "com.alphabetking.literacy.puzzle_alphabet.so",
                "com.alphabetking.literacy.puzzle.so",
                "com.alphabetking.literacy.paint.so",
                "com.alphabetking.logic.parking_2.so"
        ));
        appGroupsLetterShapes.add(loadAppGroup(
                "com.alphabetking.literacy.find_letter_in_text.so",
                "com.alphabetking.literacy.memory_letters.so"
        ));
        appGroupsLetterShapes.add(loadAppGroup(
                "com.alphabetking.literacy.match_capital_letters.so",
                "com.alphabetking.literacy.match_small_letters.so",
                "com.alphabetking.literacy.match_mixed_letters.so",
                "com.alphabetking.literacy.match_letters_words.so"
        ));
        appGroupsLetterShapes.add(loadAppGroup(
                "com.alphabetking.literacy.alphabetical_order_one.so",
                "com.alphabetking.literacy.alphabetical_order_2.so",
                "com.alphabetking.literacy.alphabetical_order_3.so"
        ));
        appCategoryLetterShapes.setAppGroups(appGroupsLetterShapes);
        appCategories.add(appCategoryLetterShapes);


        // 04 Writing
        AppCategory appCategoryWriting = new AppCategory();
        appCategoryWriting.setName("Dhigaal");
        List<AppGroup> appGroupsWriting = new ArrayList<>();
        appGroupsWriting.add(loadAppGroup(
                "com.alphabetking.drawing_line",
                "com.thealphabetking.kidsedu.videoapp.how_to_write.so",
                "com.alphabetking.literacy.write.so",
                "com.alphabetking.trace_so"
        ));
        appCategoryWriting.setAppGroups(appGroupsWriting);
        appCategories.add(appCategoryWriting);


        // 05 Blending
        AppCategory appCategoryBlending = new AppCategory();
        appCategoryBlending.setName("Isku-qasid");
        List<AppGroup> appGroupsBlending = new ArrayList<>();
        appGroupsBlending.add(loadAppGroup(
                "com.alphabetking.literacy.spelling_first_sound.so",
                "com.alphabetking.literacy.spelling_last_sound.so",
                "com.alphabetking.literacy.spelling_middle_sound.so",
                "com.alphabetking.literacy.spelling_small_words.so",
                "com.alphabetking.literacy.spelling_vowels.so"
        ));
        appGroupsBlending.add(loadAppGroup(
                "com.alphabetking.literacy.spelling_small_words_2.so",
                "com.alphabetking.literacy.spelling_sentences.so"
        ));
        appGroupsBlending.add(loadAppGroup(
                "com.alphabetking.literacy.puzzle_blends.so",
                "com.alphabetking.literacy.find_word_in_line.so",
                "com.alphabetking.literacy.grid_small_words.so",
                "com.alphabetking.literacy.grid_huge.so"
        ));
        appCategoryBlending.setAppGroups(appGroupsBlending);
        appCategories.add(appCategoryBlending);


        // 06 Words
        AppCategory appCategoryWords = new AppCategory();
        appCategoryWords.setName("Erayo");
        List<AppGroup> appGroupsWords = new ArrayList<>();
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.small_words.so",
                "com.alphabetking.literacy.pronouns.so",
                "com.alphabetking.literacy.wordpuzzle.so",
                "com.alphabetking.literacy.parking_words.so",
                "com.alphabetking.literacy.grid_sight_words.so",
                "com.alphabetking.literacy.fast_reader.so"
        ));
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.rooms.so",
                "com.alphabetking.literacy.words.so",
                "com.alphabetking.literacy.body_parts_african.so",
                "com.alphabetking.literacy.record_word.so",
                "com.alphabetking.literacy.select_correct_spelling.so",
                "com.alphabetking.literacy.sneaky_e.so"
        ));
        appGroupsWords.add(loadAppGroup(
                "com.alphabetking.literacy.sort_it_out_text.so",
                "com.alphabetking.literacy.synonyms.so",
                "com.alphabetking.literacy.opposite.so",
                "com.alphabetking.literacy.preposition.so",
                "com.alphabetking.logic.compare_color.so",
                "com.alphabetking.literacy.fake_or_real.so",
                "com.alphabetking.literacy.numbers.so",
                "com.alphabetking.literacy.days_and_months.so",
                "com.alphabetking.literacy.plural_nouns.so",
                "com.alphabetking.literacy.size.so",
                "com.alphabetking.literacy.memory_sound_word.so",
                "com.gmail.programmersimeon.memory_word.so"
        ));
        appCategoryWords.setAppGroups(appGroupsWords);
        appCategories.add(appCategoryWords);


        // 07 Sentences
        AppCategory appCategorySentences = new AppCategory();
        appCategorySentences.setName("Weedho");
        List<AppGroup> appGroupsSentences = new ArrayList<>();
        appGroupsSentences.add(loadAppGroup(
                "com.alphabetking.literacy.room_and_concepts.so",
                "com.alphabetking.literacy.verbs_to_be.so",
                "com.alphabetking.literacy.verbs.so",
                "com.alphabetking.literacy.nouns.so",
                "com.alphabetking.literacy.prepositions.so",
                "com.alphabetking.literacy.punctuation_marks.so"
        ));
        appGroupsSentences.add(loadAppGroup(
                "com.alphabetking.literacy.match_sentences_1.so",
                "com.alphabetking.literacy.match_sentences_2.so",
                "com.alphabetking.literacy.match_sentences_3.so",
                "com.alphabetking.literacy.match_sentences_4.so",
                "com.alphabetking.literacy.coloring_book.so",
                "com.alphabetking.literacy.complete_the_sentence.so"
        ));
        appGroupsSentences.add(loadAppGroup(
                "com.alphabetking.literacy.record_sentences.so",
                "com.alphabetking.literacy.grid_sentences.so",
                "com.alphabetking.literacy.questions.so",
                "com.alphabetking.literacy.reading_comprehension.so",
                "com.alphabetking.literacy.sequence_sentences.so",
                "com.alphabetking.literacy.citizen_complete_the_sentence.so"
        ));
        appGroupsSentences.add(loadAppGroup(
                "com.alphabetking.literacy.make_sentences_1.so",
                "com.alphabetking.literacy.make_sentences_2.so",
                "com.alphabetking.literacy.make_sentences_3.so",
                "com.alphabetking.literacy.abuse_complete_sentence.so",
                "com.alphabetking.literacy.abuse_make_sentence.so"
        ));
        appCategorySentences.setAppGroups(appGroupsSentences);
        appCategories.add(appCategorySentences);


        // 08 Reading stories
        AppCategory appCategoryReadingStories = new AppCategory();
        appCategoryReadingStories.setName("Sheekooyin akhris");
        List<AppGroup> appGroupsReadingStories = new ArrayList<>();
        appGroupsReadingStories.add(loadAppGroup(
                "com.alphabetking.story.level_a.so",
                "com.alphabetking.story.level_b.so",
                "com.alphabetking.literacy.books_level_c.so",
                "com.alphabetking.literacy.books_level_d.so"
        ));
        appGroupsReadingStories.add(loadAppGroup(
                "com.alphabetking.literacy.mariama.so",
                "com.alphabetking.literacy.mariama_and_mousa.so",
                "com.alphabetking.literacy.mousa.so"
        ));
        appGroupsReadingStories.add(loadAppGroup(
                "com.alphabetking.literacy.monkeys.so",
                "com.alphabetking.literacy.monkeys_2.so",
                "com.alphabetking.literacy.penguins.so",
                "com.alphabetking.literacy.the_hen.so"
        ));
        appCategoryReadingStories.setAppGroups(appGroupsReadingStories);
        appCategories.add(appCategoryReadingStories);


//        // 09 Numeracy
//        AppCategory appCategoryNumeracy = new AppCategory();
//        appCategoryNumeracy.setName("Tirinta");
//        List<AppGroup> appGroupsNumeracy = new ArrayList<>();
//        appGroupsNumeracy.add(loadAppGroup(
//                "..."
//        ));
//        appGroupsNumeracy.add(loadAppGroup(
//                "..."
//        ));
//        appCategoryNumeracy.setAppGroups(appGroupsNumeracy);
//        appCategories.add(appCategoryNumeracy);
/*
        // 09 Numeracy
        AppCategory appCategoryNumeracy = new AppCategory();
        appCategoryNumeracy.setName("Tirinta");
        List<AppGroup> appGroupsNumeracy = new ArrayList<>();
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.logic.mirror_pattern",
                "com.alphabetking.logic.color_fractions",
                "com.bokstavkongen.barnutd.tall_linje",
                "com.bokstavkongen.barnutd.storre_eller_mindre",
                "com.alphabetking.numbers.quantity",
                "com.alphabetking.number.find_the_number_missing",
                "com.alphabetking.number.find_the_number",
                "com.alphabetking.number.match_numbers",
                "com.alphabetking.number.sort_numbers"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.addition",
                "com.alphabetking.math.sort_addition",
                "com.alphabetking.math.math_room_addition",
                "com.alphabetking.math.puzzle_addition"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.alphabetking.math.subtraction",
                "com.alphabetking.math.sort_subtraction",
                "com.alphabetking.math.math_room_subtraction",
                "com.alphabetking.math.puzzle_subtraction",
                "com.alphabetking.math.whats_missing_subtraction"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.thealphabetking.kidsedu.math_multiplication",
                "com.alphabetking.math.sort_multiplication",
                "com.alphabetking.math.whats_missing_multiplication"
        ));
        appGroupsNumeracy.add(loadAppGroup(
                "com.thealphabetking.kidsedu.math_divison",
                "com.alphabetking.math.math_room_mix"
        ));
        appCategoryNumeracy.setAppGroups(appGroupsNumeracy);
        appCategories.add(appCategoryNumeracy);
*/

        appCollection.setAppCategories(appCategories);

        return appCollection;
    }

    // TODO: fetch via Appstore library
    public static AppCollection loadAppCollectionNumeracy() {
        Log.i(AppCollectionGenerator.class.getName(), "loadAppCollectionNumeracy");

        AppCollection appCollection = new AppCollection();

        List<AppCategory> appCategories = new ArrayList<>();

        // 00 Logic
        AppCategory appCategoryLogic = new AppCategory();
        appCategoryLogic.setName("Logic");
        List<AppGroup> appGroupsLogic = new ArrayList<>();
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.find_colors",
                "com.thealphabetking.kidsedu.find_shape",
                "com.alphabetking.logic.find_shadows",
                "com.alphabetking.logic.find_section",
                "com.alphabetking.logic.pairs_font_and_back",
                "no.leaplearning.logic.mirror_pattern"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.pattern",
                "com.alphabetking.logic.whatshapefits",
                "com.alphabetking.logic.find_pairs",
                "com.alphabetking.logic.match_pairs",
                "com.alphabetking.logic.missingpart",
                "com.alphabetking.logic.find_shape_mix"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.match_3_mix",
                "com.alphabetking.logic.sequence",
                "com.alphabetking.logic.matrix",
                "com.alphabetking.logic.match_belong",
                "com.alphabetking.logic.whatfits",
                "com.alphabetking.logic.find_3d_shapes"                             //MISSING for 7"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.puzzle_image",
                "com.alphabetking.logic.find_opposite",
                "com.alphabetking.logic.match_opposite",
                "com.alphabetking.logic.find_senses",
                "com.alphabetking.literacy.sort_it_out",
                "com.alphabetking.logic.time"
        ));
        appGroupsLogic.add(loadAppGroup(
                "com.alphabetking.logic.sequence_programming",
                "com.alphabetking.logic.camera"
        ));
        appCategoryLogic.setAppGroups(appGroupsLogic);
        appCategories.add(appCategoryLogic);


        // Numbers
        AppCategory appCategoryNumbers = new AppCategory();
        appCategoryNumbers.setName("Numbers");
        List<AppGroup> appGroupsNumbers = new ArrayList<>();
        appGroupsNumbers.add(loadAppGroup(
                "no.leaplearning.numeracy.color_squares",
                "no.leaplearning.numeracy.find_number",
                "no.leaplearning.numeracy.match_number",
                "no.leaplearning.numeracy.sort_quantity",
                "no.leaplearning.numeracy.numbers_in_grid",
                "no.leaplearning.numeracy.find_the_number_in_image"
        ));
        appGroupsNumbers.add(loadAppGroup(
                //"com.alphabetking.number.number_in_line",
                "no.leaplearning.numeracy.find_the_number",
                "no.leaplearning.numeracy.find_the_number_sound",
                "no.leaplearning.numeracy.parking_numbers",
                "no.leaplearning.numeracy.number_in_line",
                "com.alphabetking.number.find_the_number_missing",
                "no.leaplearning.numeracy.find_number_in_line"
        ));
        appGroupsNumbers.add(loadAppGroup(
                "no.leaplearning.numeracy.paint_the_number",
                "no.leaplearning.numeracy.memory_numbers",
                "no.leaplearning.numeracy.puzzle_numbers",
                "no.leaplearning.numeracy.jigsaw_puzzle_numbers",
                "com.alphabetking.literacy.remember_the_numbers",
                "no.leaplearning.numeracy.fast_reader_numbers"
        ));
        appGroupsNumbers.add(loadAppGroup(
                "no.leaplearning.numeracy.bigger.smaller",
                "no.leaplearning.numeracy.color_number_10_groups",
                "no.leaplearning.numeracy.unlock_numbers",
                "no.leaplearning.numeracy.skip_jumping",
                "com.alphabetking.numeracy.stacking",
                "no.leaplearning.numeracy.sort_odd_even"
        ));
        appGroupsNumbers.add(loadAppGroup(

                "com.alphabetking.literacy.how_many_each",       // MISSING APK
                "no.leaplearning.numeracy.trace_numbers",                       // MISSING APK
                "no.leaplearning.numeracy.flash_card_numbers"                   // MISSING APK
        ));


        appCategoryNumbers.setAppGroups(appGroupsNumbers);
        appCategories.add(appCategoryNumbers);


        // Addition
        AppCategory appCategoryAddition = new AppCategory();
        appCategoryAddition.setName("Addition");
        List<AppGroup> appGroupsAddition = new ArrayList<>();
        appGroupsAddition.add(loadAppGroup(
                "com.alphabetking.math.addition",
                "com.alphabetking.math.sort_addition",
                "com.alphabetking.numeracy.whats_missing_addition"
        ));
        appGroupsAddition.add(loadAppGroup(
                "com.alphabetking.numeracy.matrix_addition",
                "no.leaplearning.numeracy.split_the_number",
                "com.alphabetking.numeracy.compare_addition",
                "com.alphabetking.numeracy.small_puzzle_addition",
                "no.leaplearning.numeracy.grid_addition",
                "no.leaplearning.numeracy.match_find_addition"
        ));
        appGroupsAddition.add(loadAppGroup(
                "com.alphabetking.numeracy.colour_squares_addition",
                "com.alphabetking.numeracy.color_addition_2",
                "com.alphabetking.math.color_grid",
                "com.alphabetking.numeracy.rainbow",
                "no.leaplearning.numeracy.memory_addition",
                "no.leaplearning.numeracy.find_the_sum_addition"                    // MISSING APK
        ));
        appGroupsAddition.add(loadAppGroup(
                "no.leaplearning.numeracy.find_match_10_groups",
                "no.leaplearning.numeracy.working_with_10s",
                "com.alphabetking.numeracy.right_or_wrong"
        ));
        appGroupsAddition.add(loadAppGroup(
                "com.alphabetking.numeracy.rooms_addition",
                "com.alphabetking.numeracy.puzzle_addition",
                "com.alphabetking.numeracy.sort_plus",
                "com.alphabetking.numeracy.fast_reader_addition",
                "com.alphabetking.numeracy.parking_addition",
                "no.leaplearning.numeracy.add_under_each_other"
        ));
        appCategoryAddition.setAppGroups(appGroupsAddition);
        appCategories.add(appCategoryAddition);


        // Subtraction
        AppCategory appCategorySubtraction = new AppCategory();
        appCategorySubtraction.setName("Subtraction");
        List<AppGroup> appGroupsSubtraction = new ArrayList<>();
        appGroupsSubtraction.add(loadAppGroup(
                "com.alphabetking.numeracy.subtract",
                "com.alphabetking.numeracy.subtraction",
                "com.alphabetking.math.sort_subtraction"
        ));
        appGroupsSubtraction.add(loadAppGroup(
                "com.alphabetking.numeracy.matrix_subtraction",
                "com.alphabetking.numeracy.whats_missing_subtraction",
                "com.alphabetking.numeracy.compare_subtraction"
        ));
        appGroupsSubtraction.add(loadAppGroup(
                "com.alphabetking.com.numeracy.rooms_subtraction",
                "com.alphabetking.numeracy.puzzle_subtraction",
                "com.alphabetking.numeracy.fast_reader_subtraction",
                "com.alphabetking.numeracy.parking_subtraction",
                "no.leaplearning.numeracy.sub_under_each_other"
        ));
        appGroupsSubtraction.add(loadAppGroup(
                "no.leaplearning.numeracy.right_or_wrong_subtraction",
                "no.leaplearning.numeracy.memory_subtraction",
                "no.leaplearning.numeracy.small_puzzle_subtraction",
                "no.leaplearning.numeracy.subtract_images",
                "no.leaplearning.numeracy.match_minus"
        ));
        appCategorySubtraction.setAppGroups(appGroupsSubtraction);
        appCategories.add(appCategorySubtraction);


        // 03 Multiplication
        AppCategory appCategoryMultiplication = new AppCategory();
        appCategoryMultiplication.setName("Multiplication & Division");
        List<AppGroup> appGroupsMultiplication = new ArrayList<>();
        appGroupsMultiplication.add(loadAppGroup(
                "com.alphabetking.numeracy.multiplication",
                "com.alphabetking.math.sort_multiplication",
                "com.alphabetking.numeracy.whats_missing_multiplication",
                "com.alphabetking.numeracy.room_multiplication"
        ));
        appGroupsMultiplication.add(loadAppGroup(
                "com.alphabetking.numeracy.multiplication_table",
                "com.alphabetking.numeracy.matrix_multiplication",
                "com.alphabetking.numeracy.multiplication_numbers",
                "com.alphabetking.numeracy.fast_reader_multiplication",
                "com.alphabetking.numeracy.parking_multiplication"
        ));
        appGroupsMultiplication.add(loadAppGroup(
                "com.alphabetking.numeracy.division",
                "com.alphabetking.numeracy.room_division",
                "com.alphabetking.numeracy.division_numbers",
                "com.alphabetking.numeracy.matrix_division",
                "com.alphabetking.numeracy.division_table",
                "com.alphabetking.numeracy.sort_division"
        ));
        appGroupsMultiplication.add(loadAppGroup(
                "com.alphabetking.numeracy.parking_division",
                "no.leaplearning.numeracy.match_divison",
                "com.alphabetking.numeracy.fast_reader_division"
        ));
        appCategoryMultiplication.setAppGroups(appGroupsMultiplication);
        appCategories.add(appCategoryMultiplication);

/*
        // 04 Division
        AppCategory appCategoryDivision = new AppCategory();
        appCategoryDivision.setName("Division");
        List<AppGroup> appGroupsDivision = new ArrayList<>();
        appGroupsDivision.add(loadAppGroup(
                "com.alphabetking.numeracy.division",
                "com.alphabetking.numeracy.room_division",
                "com.alphabetking.numeracy.division_numbers",
                "com.alphabetking.numeracy.matrix_division",
                "com.alphabetking.numeracy.division_table",
                "com.alphabetking.numeracy.sort_division"
        ));
        appGroupsDivision.add(loadAppGroup(
                "com.alphabetking.numeracy.parking_division",
                "no.leaplearning.numeracy.match_divison",
                "com.alphabetking.numeracy.fast_reader_division"
        ));
        appCategoryDivision.setAppGroups(appGroupsDivision);
        appCategories.add(appCategoryDivision);
*/

        // 05 Mix-Math
        AppCategory appCategoryMixedMath = new AppCategory();
        appCategoryMixedMath.setName("Mix-math & Concepts");
        List<AppGroup> appGroupsMixedMath = new ArrayList<>();
        appGroupsMixedMath.add(loadAppGroup(
                "com.alphabetking.numeracy.family_house",
                "com.alphabetking.numeracy.ten_cross",
                "com.alphabetking.numeracy.rooms_mix"
        ));
        appGroupsMixedMath.add(loadAppGroup(
                "com.alphabetking.numeracy.find_from_image",
                "no.leaplearning.numeracy.parking_mix",
                "no.leaplearning.numeracy.memory_plus_minus"
        ));
        appGroupsMixedMath.add(loadAppGroup(
                "no.leaplearning.numeracy.sort_mix_plus_minus",
                "no.leaplearning.numeracy.sort_mix_times_divide",
                "no.leaplearning.numeracy.fast_reader_plus_minus",
                "no.leaplearning.numeracy.fast_reader_times_divide"
        ));
        appGroupsMixedMath.add(loadAppGroup(
                "no.leaplearning.numeracy.table",   //
                "no.leaplearning.numeracy.color_fractions"          //
        ));
        appGroupsMixedMath.add(loadAppGroup(
                "com.alphabetking.numeracy.money_pair",
                "com.alphabetking.numeracy.money_add_subtract",
                "com.alphabetking.numeracy.money_bigger_smaller"
        ));

        appCategoryMixedMath.setAppGroups(appGroupsMixedMath);
        appCategories.add(appCategoryMixedMath);

/*
        // 06 Concepts
        AppCategory appCategoryConcepts = new AppCategory();
        appCategoryConcepts.setName("Concepts");
        List<AppGroup> appGroupsConcepts = new ArrayList<>();
        appGroupsConcepts.add(loadAppGroup(
                "no.leaplearning.numeracy.table",   //
                "no.leaplearning.numeracy.number_digits",
                "no.leaplearning.numeracy.decimal"
        ));
        appGroupsConcepts.add(loadAppGroup(
                "com.alphabetking.numeracy.ruler",
                "com.alphabetking.logic.scale",
                "no.leaplearning.numeracy.color_fractions"          //
        ));
        appGroupsConcepts.add(loadAppGroup(
                "com.alphabetking.logic.find_correct_size"
        ));
        appGroupsConcepts.add(loadAppGroup(

        ));
        appCategoryConcepts.setAppGroups(appGroupsConcepts);
        appCategories.add(appCategoryConcepts);
*/

        appCollection.setAppCategories(appCategories);

        return appCollection;
    }


    private static AppGroup loadAppGroup(String appGroupTitle, String... packageNames) {
        AppGroup appGroup = new AppGroup();

        List<ApplicationGson> applications = new ArrayList<>();
        for (String packageName : packageNames) {
            ApplicationGson application = new ApplicationGson();
            application.setPackageName(packageName);
            applications.add(application);
        }
        appGroup.setApplications(applications);
        appGroup.setGroupTitle(appGroupTitle);

        return appGroup;
    }
}
