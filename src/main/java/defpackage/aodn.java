package defpackage;

/* renamed from: aodn */
public enum aodn implements anxv {
    SUBTYPE_NONE(0),
    SUBTYPE_IME(1),
    SUBTYPE_TRANSLIT(2),
    SUBTYPE_FRESH(3),
    SUBTYPE_ROMAJI(4),
    SUBTYPE_MID_STRING(5),
    SUBTYPE_UNMATCHED_SPELLING(6),
    SUBTYPE_CURSOR_BASED(7),
    SUBTYPE_BAG_OF_WORDS(8),
    SUBTYPE_REFINEMENT(9),
    SUBTYPE_SPELLING(10),
    SUBTYPE_PREFIX_SPELLING(11),
    SUBTYPE_GENERALIZED_PINYIN(12),
    SUBTYPE_LIVE_SPELLING(13),
    SUBTYPE_ISA(14),
    SUBTYPE_FRESH_RERANKED(131),
    SUBTYPE_LANGUAGE_LEVEL_FRESH(324),
    SUBTYPE_FRESH_NEWS(155),
    SUBTYPE_CURATED_NEWS(277),
    SUBTYPE_IMPROV(15),
    SUBTYPE_PRODUCT_REFINEMENTS(16),
    SUBTYPE_QUERY_VARIANTS(18),
    SUBTYPE_LANGUAGE_DETECTOR(19),
    SUBTYPE_PERSONALIZED_RERANK(20),
    SUBTYPE_TOKEN_RERANK(263),
    SUBTYPE_ANIMA_ENTITY_RERANK(265),
    SUBTYPE_SALIENT_TERMS_RERANK(266),
    SUBTYPE_ISTA_RERANK(288),
    SUBTYPE_UVP_RERANK(319),
    SUBTYPE_TAIL(21),
    SUBTYPE_PRODLM(299),
    SUBTYPE_QREWRITE(22),
    SUBTYPE_CUT_ROMAJI_CONSONANT(23),
    SUBTYPE_SERVICE_REROUTING(24),
    SUBTYPE_DOCUMENT_GENERATED(26),
    SUBTYPE_SOCIAL_PROFILE(27),
    SUBTYPE_AGGRESSIVE_QREWRITE(29),
    SUBTYPE_BRAIN(160),
    SUBTYPE_BRAIN_ON_DEVICE(168),
    SUBTYPE_KOMODO(30),
    SUBTYPE_SOCIAL_PLUSPAGE(43),
    SUBTYPE_ROMAJI_NORMALIZATION(32),
    SUBTYPE_KANJI_ROMANIZED(37),
    SUBTYPE_PERSONAL(39),
    SUBTYPE_PERSONAL_TAIL(289),
    SUBTYPE_IS_SQUIGGLY_LINE_ENABLED(42),
    SUBTYPE_PROMOTED_URL(44),
    SUBTYPE_DISAMBIGUATED_BY_ENTITIES(46),
    SUBTYPE_GMAIL(48),
    SUBTYPE_DRIVE(49),
    SUBTYPE_PHOTOS(50),
    SUBTYPE_CALENDAR(51),
    SUBTYPE_PLACEPRINT(52),
    SUBTYPE_ECHOED_SEARCH_THE_WEB(53),
    SUBTYPE_INLINEABLE(54),
    SUBTYPE_ANSWER(70),
    SUBTYPE_PREFETCH_ANSWER(56),
    SUBTYPE_ANSWER_PLAYINSTALL(245),
    SUBTYPE_ANSWER_DICTIONARY(249),
    SUBTYPE_ANSWER_FINANCE(250),
    SUBTYPE_ANSWER_GENERIC_ANSWER(251),
    SUBTYPE_ANSWER_SPORTS(253),
    SUBTYPE_ANSWER_SUNRISE_SUNSET(254),
    SUBTYPE_ANSWER_TRANSLATION(255),
    SUBTYPE_ANSWER_WEATHER(256),
    SUBTYPE_ANSWER_WHEN_IS(257),
    SUBTYPE_ANSWER_CURRENCY(258),
    SUBTYPE_ANSWER_LOCAL_TIME(259),
    SUBTYPE_ANSWER_BLOCKING_FETCH(285),
    SUBTYPE_ANSWER_LOOK_UP(320),
    SUBTYPE_OMNIBOX_ECHO_SEARCH(57),
    SUBTYPE_OMNIBOX_ECHO_URL(58),
    SUBTYPE_OMNIBOX_HISTORY_SEARCH(59),
    SUBTYPE_OMNIBOX_HISTORY_URL(60),
    SUBTYPE_OMNIBOX_HISTORY_TITLE(61),
    SUBTYPE_OMNIBOX_HISTORY_BODY(62),
    SUBTYPE_OMNIBOX_HISTORY_KEYWORD(63),
    SUBTYPE_OMNIBOX_OTHER(64),
    SUBTYPE_OMNIBOX_BOOKMARK_TITLE(65),
    SUBTYPE_URL_BASED(66),
    SUBTYPE_OMNIBOX_NEARBY_URL(190),
    SUBTYPE_OMNIBOX_NEARBY_URL_MULTIPLE(191),
    SUBTYPE_HIVEMIND(67),
    SUBTYPE_MAPS_HEAD_MODEL(69),
    SUBTYPE_MAPS_INJECTED_CATEGORY(334),
    SUBTYPE_MAPS_WAYPOINT_REFINEMENT(169),
    SUBTYPE_REFINEMENTS(71),
    SUBTYPE_MAPS_LOCAL_WEB(72),
    SUBTYPE_MAPS_ADD_A_PLACE(144),
    SUBTYPE_ACTION_PHONE_CALL(73),
    SUBTYPE_ACTION_SMS(74),
    SUBTYPE_ACTION_SET(75),
    SUBTYPE_ACTION_NAVIGATION(76),
    SUBTYPE_ACTION_HTML_ANSWER(77),
    SUBTYPE_ACTION_OPEN_APP(78),
    SUBTYPE_ACTION_BUSINESS(79),
    SUBTYPE_ACTION_CONTACT(80),
    SUBTYPE_ACTION_LOCATION_REMINDER(81),
    SUBTYPE_ACTION_ALARM(82),
    SUBTYPE_ACTION_TIME_REMINDER(85),
    SUBTYPE_ACTION_EMAIL(86),
    SUBTYPE_ACTION_DIRECTIONS(87),
    SUBTYPE_ACTION_SELF_NOTE(88),
    SUBTYPE_ACTION_AGENDA(89),
    SUBTYPE_ACTION_PLAY_SONG(90),
    SUBTYPE_ACTION_ADD_CALENDAR(91),
    SUBTYPE_ACTION_START_RUN(92),
    SUBTYPE_ACTION_WEATHER(93),
    SUBTYPE_ACTION_CALCULATOR(94),
    SUBTYPE_ACTION_DICTIONARY(95),
    SUBTYPE_ACTION_STOCK(96),
    SUBTYPE_ACTION_LOCAL(97),
    SUBTYPE_ACTION_CONVERSION(98),
    SUBTYPE_ACTION_MAP(99),
    SUBTYPE_ACTION_ADDRESS(100),
    SUBTYPE_ACTION_HOURS_OF_BUSINESS(101),
    SUBTYPE_ACTION_DISTANCE(102),
    SUBTYPE_ACTION_CURRENCY(103),
    SUBTYPE_ACTION_TRANSLATION(104),
    SUBTYPE_ACTION_FLIGHTS(105),
    SUBTYPE_ACTION_TRAFFIC(106),
    SUBTYPE_ACTION_IMAGES(107),
    SUBTYPE_ACTION_VIDEOS(108),
    SUBTYPE_ACTION_NEWS(109),
    SUBTYPE_ACTION_SHOWTIMES(110),
    SUBTYPE_ACTION_OFFLINE(130),
    SUBTYPE_ACTION_CHANGE_WIFI_SETTING(137),
    SUBTYPE_ACTION_CHANGE_SOUND_SETTING(138),
    SUBTYPE_ACTION_CHANGE_FLASHLIGHT_SETTING(139),
    SUBTYPE_ACTION_CHANGE_BLUETOOTH_SETTING(140),
    SUBTYPE_ACTION_CHANGE_DISPLAY_SETTING(141),
    SUBTYPE_ACTION_PORKYPIG(142),
    SUBTYPE_DISCOVERABILITY_SEARCHBOX_WITH_HOTWORD(83),
    SUBTYPE_DISCOVERABILITY_SEARCHBOX_WITH_TRY_SAYING(126),
    SUBTYPE_DISCOVERABILITY_SEARCHBOX_QSB_HINT_TEXT_FOLLOWUP_IN_SUGGEST(192),
    SUBTYPE_DISCOVERABILITY_CUECARD(84),
    SUBTYPE_DISCOVERABILITY_CUECARD_WITH_TRY_SAYING(127),
    SUBTYPE_DISCOVERABILITY_CUECARD_DOWN_ARROW(157),
    SUBTYPE_DISCOVERABILITY_CUECARD_HEADLINES(158),
    SUBTYPE_DISCOVERABILITY_VOICY(147),
    SUBTYPE_DISCOVERABILITY_VOICY_WITH_TRY_SAYING(149),
    SUBTYPE_VOICE_SRP_TIP(146),
    SUBTYPE_PERSONAL_MAPS_FEATURE(111),
    SUBTYPE_PERSONAL_MAPS_CATEGORY(112),
    SUBTYPE_PERSONAL_MAPS_CONTACT(113),
    SUBTYPE_PERSONAL_MAPS_ALIAS_HOME_WORK(114),
    SUBTYPE_PERSONAL_MAPS_ALIAS_NICKNAME(115),
    SUBTYPE_PERSONAL_MAPS_STAR(116),
    SUBTYPE_PERSONAL_MAPS_REVIEW(117),
    SUBTYPE_PERSONAL_MAPS_FLIGHT(118),
    SUBTYPE_PERSONAL_MAPS_HOTEL_RESERVATION(119),
    SUBTYPE_PERSONAL_MAPS_RESTAURANT_RESERVATION(120),
    SUBTYPE_PERSONAL_MAPS_WEB_LOCAL(121),
    SUBTYPE_PERSONAL_MAPS_WEB_KNOWLEDGECARD(afy.av),
    SUBTYPE_PERSONAL_MAPS_EMBEDDED_LOAD_CLICK(124),
    SUBTYPE_PERSONAL_MAPS_I_AM_HERE_CLICK(125),
    SUBTYPE_PERSONAL_MAPS_SINGLE_SUPPORT_QUERY(128),
    SUBTYPE_PERSONAL_MAPS_NO_SUPPORT_QUERY(129),
    SUBTYPE_PERSONAL_MAPS_PLACE_LIST_FEATURE(172),
    SUBTYPE_PERSONAL_MAPS_PLACE_LIST(185),
    SUBTYPE_VOICE_PROMO_START_VOICE_INPUT(132),
    SUBTYPE_VOICE_PROMO_ZERO_PREFIX(145),
    SUBTYPE_ICING_WEB(134),
    SUBTYPE_ICING_WEB_IDD(248),
    SUBTYPE_OFFLINE_MAPS(135),
    SUBTYPE_ICING_SEARCH_HISTORY(136),
    SUBTYPE_TRENDS(143),
    SUBTYPE_TRENDS_RERANK(179),
    SUBTYPE_TRENDS_ENTITY_SMEARED_RERANK(309),
    SUBTYPE_PERSONALIZED_PULSAR(229),
    SUBTYPE_PERSONALIZED_FRESH_PULSAR(301),
    SUBTYPE_PERSONALIZED_ZERO_PREFIX_PULSAR(328),
    SUBTYPE_ULP(203),
    SUBTYPE_FRESH_APP_RESULT(148),
    SUBTYPE_LU(199),
    SUBTYPE_LU_CATEGORICAL(150),
    SUBTYPE_LU_CATEGORICAL_WITH_ICON(196),
    SUBTYPE_LU_CATEGORICAL_FOOD_AND_DRINK(197),
    SUBTYPE_LU_CATEGORICAL_LODGING(198),
    SUBTYPE_LU_CATEGORICAL_WITHOUT_ICON(202),
    SUBTYPE_LU_NAVIGATIONAL(175),
    SUBTYPE_LU_POI_PROMINENCE(310),
    SUBTYPE_LU_POI_DISTANCE(311),
    SUBTYPE_LU_CHAIN(291),
    SUBTYPE_LU_CHAIN_WITH_MODIFIER(321),
    SUBTYPE_LU_SUGGESTED_SET(267),
    SUBTYPE_LU_PROMOTED_CATEGORICAL(270),
    SUBTYPE_ONBOARDING(154),
    SUBTYPE_ZP_RAMADAN(225),
    SUBTYPE_ZP_WORLDCUP(290),
    SUBTYPE_ZP_MLB(307),
    SUBTYPE_PROACTIVE_ZPS(308),
    SUBTYPE_ZP_WORLDCUP_COUNTRY(295),
    SUBTYPE_LAST_SLOT_TRANSLITERATION(159),
    SUBTYPE_IPA_CONTACT_RESULT(161),
    SUBTYPE_IPA_MESSAGE_RESULT(162),
    SUBTYPE_IPA_EMAIL_RESULT(163),
    SUBTYPE_IPA_INSTALLED_APPS_RESULT(164),
    SUBTYPE_IPA_STANDARD_RESULT(165),
    SUBTYPE_IPA_ERROR_RESULT(167),
    SUBTYPE_IPA_USER_ONBOARDING_RESULT(170),
    SUBTYPE_IPA_PHOTO_RESULT(186),
    SUBTYPE_IPA_SHORTCUT_PROMPT_RESULT(174),
    SUBTYPE_IPA_CONTEXTUAL_ROUTINE_RESULT(181),
    SUBTYPE_IPA_CONTEXTUAL_POPULAR_AT_PLACE_RESULT(182),
    SUBTYPE_IPA_CONTEXTUAL_TRENDING_RESULT(183),
    SUBTYPE_IPA_GWS_RESULT(193),
    SUBTYPE_IPA_PERMISSION_RESULT(194),
    SUBTYPE_IPA_CONTACT_APP_RESULT(195),
    SUBTYPE_IPA_GMAIL_INTELLIGENCE_RESULT(206),
    SUBTYPE_IPA_GMAIL_INTELLIGENCE_FLIGHT_RESULT(207),
    SUBTYPE_IPA_GMAIL_INTELLIGENCE_ORDER_RESULT(208),
    SUBTYPE_IPA_GMAIL_INTELLIGENCE_HOTEL_RESERVATION_RESULT(240),
    SUBTYPE_IPA_GMAIL_INTELLIGENCE_CAR_RENTAL_RESERVATION_RESULT(241),
    SUBTYPE_IPA_GMAIL_INTELLIGENCE_RESTAURANT_RESERVATION_RESULT(242),
    SUBTYPE_IPA_GMAIL_INTELLIGENCE_SOCIAL_EVENT_RESULT(243),
    SUBTYPE_IPA_GMAIL_INTELLIGENCE_TRANSPORTATION_RESULT(276),
    SUBTYPE_ICING_RESERVATION_RESULT(246),
    SUBTYPE_ICING_FLIGHT_RESULT(247),
    SUBTYPE_IPA_APPLY_CATEGORY_FILTER(210),
    SUBTYPE_IPA_CLEAR_CATEGORY_FILTER(211),
    SUBTYPE_IPA_APPLY_APP_FILTER(214),
    SUBTYPE_IPA_CLEAR_APP_FILTER(215),
    SUBTYPE_ICING_MESSAGE_RESULT(216),
    SUBTYPE_IPA_CHIP(233),
    SUBTYPE_IPA_CLEAR_CHIP(237),
    SUBTYPE_IPA_CLEAR_PEOPLE_IMMERSIVE_FILTER(217),
    SUBTYPE_IPA_PEOPLE_IMMERSIVE_HEADER(221),
    SUBTYPE_IPA_PEOPLE_CLUSTER(222),
    SUBTYPE_IPA_NOTIFICATION_ONBOARDING_RESULT(224),
    SUBTYPE_IPA_LINK(234),
    SUBTYPE_IPA_CALENDAR_EVENT(260),
    SUBTYPE_ICING_DOCUMENT_RESULT(218),
    SUBTYPE_ICING_VIDEO_RESULT(235),
    SUBTYPE_IPA_CHROME(261),
    SUBTYPE_IPA_PERSONALIZED_ONBOARDING_RESULT(262),
    SUBTYPE_IPA_GOOGLE_MAPS(268),
    SUBTYPE_IPA_LG_SETTINGS_BUTTON(318),
    SUBTYPE_LOCAL_MALL_BOOSTED_CATEGORY(166),
    SUBTYPE_WEB_ON_DEVICE_SUGGESTION(173),
    SUBTYPE_CLIPBOARD_TEXT(176),
    SUBTYPE_CLIPBOARD_URL(177),
    SUBTYPE_CLIPBOARD_INTENT(178),
    SUBTYPE_CLIPBOARD_IMAGE(327),
    SUBTYPE_LOCAL_MINI_APP_ECHOED_SUGGESTION(180),
    SUBTYPE_DINING_MINI_APP(188),
    SUBTYPE_FUZZY_KEYBOARD(189),
    SUBTYPE_COUNTERFACTUAL_DUMMY(204),
    SUBTYPE_PIVOT_QUERY(205),
    SUBTYPE_KEYBOARD_PREDICTION(212),
    SUBTYPE_CACHED_SEARCH_RESULTS(219),
    SUBTYPE_WORD_BY_WORD_OFFLINE_MODEL(220),
    SUBTYPE_PIXEL_APPS(223),
    SUBTYPE_CONTACTS_MODE_CONTACT_RESULT(226),
    SUBTYPE_CONTEXT_BRAIN(227),
    SUBTYPE_VASCO(228),
    SUBTYPE_ZAGAT_LIST(231),
    SUBTYPE_PIPS_HYPERLOCAL(316),
    SUBTYPE_PIPS_ULYSSES_SUGGEST(232),
    SUBTYPE_PIPS_GENX_HYPERLOCAL_SUGGEST(278),
    SUBTYPE_PIPS_DISABLE_PSUGGEST(313),
    SUBTYPE_IPA_NOTIFICATION_LARGE_CARD_RESULT(236),
    SUBTYPE_ICING_SMS_RESULT(238),
    SUBTYPE_ASSISTANT_FOLLOW_UP_QUERY(239),
    SUBTYPE_RICH_TUHMBNAIL(244),
    SUBTYPE_ICING_PLACE_RESULT(269),
    SUBTYPE_SUGGEST_2G_LITE(271),
    SUBTYPE_HOBBES_SUGGEST(273),
    SUBTYPE_AUTO_EXPAND_SUGGESTION(275),
    SUBTYPE_PERSONAL_IMAGE(279),
    SUBTYPE_PERSONAL_NEWS(280),
    SUBTYPE_PERSONAL_YOUTUBE(281),
    SUBTYPE_PERSONAL_MAPS(282),
    SUBTYPE_PERSONAL_WEB(283),
    SUBTYPE_ICING_APP_SLICE(286),
    SUBTYPE_ICING_LIVE_SLICE(298),
    SUBTYPE_SLICE_PREWARM_ONLY(300),
    SUBTYPE_ELIGIBLE_FOR_SLICE_UPGRADE(323),
    SUBTYPE_SLICE_RENDERED(325),
    SUBTYPE_SLICE_OVERRIDE(326),
    SUBTYPE_NEW_USER_PREDEFINED(287),
    SUBTYPE_MORE_RECENT_SEARCHES(292),
    SUBTYPE_NEXT_WORD_BASED_ON_0_PREVIOUS_WORDS(293),
    SUBTYPE_NEXT_WORD_BASED_ON_1_PREVIOUS_WORDS(294),
    SUBTYPE_ZERO_PREFIX_ICING(296),
    SUBTYPE_RECIPES(297),
    SUBTYPE_PERSONAL_IME(302),
    SUBTYPE_PERSONAL_TRANSLIT(303),
    SUBTYPE_PERSONAL_SPELLING(304),
    SUBTYPE_PERSONAL_PREFIX_SPELLING(305),
    SUBTYPE_PERSONAL_BAG_OF_WORDS(306),
    SUBTYPE_ACCENTUATE_QUERY_BUILDER(312),
    SUBTYPE_ACTION(314),
    SUBTYPE_ACTION_AT_ZERO(315),
    SUBTYPE_VOZ_ESCAPE_HATCH(317),
    SUBTYPE_EXPERIMENTAL_CATEGORY(322),
    SUBTYPE_IMAGE_MODE(329),
    SUBTYPE_IMAGE_MODE_TRIGGER(330),
    SUBTYPE_FOLLOW_LURE_BASEBALL(331),
    SUBTYPE_FOLLOW_LURE_CRICKET_WORLD_CUP_2019(336),
    SUBTYPE_USE_AS_HINT_TEXT(332),
    SUBTYPE_RANKEMBED(333),
    SUBTYPE_MONDEGREEN(335),
    SUBTYPE_TOPIC_FEED(337),
    DEPRECATED_SUBTYPE_MAPS_SUGGEST(17),
    DEPRECATED_SUBTYPE_QUERYNATION(25),
    DEPRECATED_SUBTYPE_GLOBAL_PROFILE(28),
    DEPRECATED_SUBTYPE_GLOBAL_PLUSPAGE(31),
    DEPRECATED_SUBTYPE_CLEANUP_NON_ALPHANUM(33),
    DEPRECATED_SUBTYPE_SOCIAL_HASHTAGS(35),
    DEPRECATED_SUBTYPE_GLOBAL_HASHTAGS(36),
    DEPRECATED_SUBTYPE_INFINITE(38),
    DEPRECATED_SUBTYPE_LIVE_SPELLING_DID_YOU_MEAN(40),
    DEPRECATED_SUBTYPE_UNIVERSAL(41),
    DEPRECATED_SUBTYPE_HYPERLOCAL(45),
    DEPRECATED_SUBTYPE_ENTITY(47),
    DEPRECATED_SUBTYPE_CHARACTER_REWRITES(55),
    DEPRECATED_SUBTYPE_COLLECTION_QREWRITE(68),
    DEPRECATED_SUBTYPE_VOICE_CORRECTION(133),
    DEPRECATED_SUBTYPE_BROWSABLE_RECENT_SEARCHES(151),
    DEPRECATED_SUBTYPE_BROWSABLE_WHATS_HOT(152),
    DEPRECATED_SUBTYPE_BROWSABLE_NEARBY(153),
    DEPRECATED_SUBTYPE_BROWSABLE_PREVIOUS(156),
    DEPRECATED_SUBTYPE_IPA_SECONDARY_INSTALLED_APPS(171),
    DEPRECATED_SUBTYPE_ZP_OSCARS(200),
    DEPRECATED_SUBTYPE_IPA_PEOPLE_RESULT(209),
    DEPRECATED_SUBTYPE_PIXEL_CONTACTS(230),
    DEPRECATED_SUBTYPE_ANSWER_LOCAL(252),
    DEPRECATED_SUBTYPE_GAME_RERANK(264),
    DEPRECATED_SUBTYPE_ICING_SLICE(284),
    DEPRECATED_SUBTYPE_PERSONALIZED_LEGOS(187),
    DEPRECATED_SUBTYPE_CUSCO(213),
    DEPRECATED_SUBTYPE_SAAS(34),
    DEPRECATED_SUBTYPE_INSTANT_APP_PARTNER_DOMAIN_FOUND(201),
    DEPRECATED_SUBTYPE_IPA_RECENTS_RESULT(272),
    DEPRECATED_SUBTYPE_IPA_RECENTS_FILTER_MODE_RESULT(274);
    
    public final int b;

    public final int getNumber() {
        return this.b;
    }

    public static aodn a(int i) {
        switch (i) {
            case 0:
                return SUBTYPE_NONE;
            case 1:
                return SUBTYPE_IME;
            case 2:
                return SUBTYPE_TRANSLIT;
            case 3:
                return SUBTYPE_FRESH;
            case 4:
                return SUBTYPE_ROMAJI;
            case 5:
                return SUBTYPE_MID_STRING;
            case 6:
                return SUBTYPE_UNMATCHED_SPELLING;
            case 7:
                return SUBTYPE_CURSOR_BASED;
            case 8:
                return SUBTYPE_BAG_OF_WORDS;
            case 9:
                return SUBTYPE_REFINEMENT;
            case 10:
                return SUBTYPE_SPELLING;
            case 11:
                return SUBTYPE_PREFIX_SPELLING;
            case 12:
                return SUBTYPE_GENERALIZED_PINYIN;
            case 13:
                return SUBTYPE_LIVE_SPELLING;
            case 14:
                return SUBTYPE_ISA;
            case 15:
                return SUBTYPE_IMPROV;
            case 16:
                return SUBTYPE_PRODUCT_REFINEMENTS;
            case 17:
                return DEPRECATED_SUBTYPE_MAPS_SUGGEST;
            case 18:
                return SUBTYPE_QUERY_VARIANTS;
            case 19:
                return SUBTYPE_LANGUAGE_DETECTOR;
            case 20:
                return SUBTYPE_PERSONALIZED_RERANK;
            case 21:
                return SUBTYPE_TAIL;
            case 22:
                return SUBTYPE_QREWRITE;
            case 23:
                return SUBTYPE_CUT_ROMAJI_CONSONANT;
            case 24:
                return SUBTYPE_SERVICE_REROUTING;
            case 25:
                return DEPRECATED_SUBTYPE_QUERYNATION;
            case 26:
                return SUBTYPE_DOCUMENT_GENERATED;
            case 27:
                return SUBTYPE_SOCIAL_PROFILE;
            case 28:
                return DEPRECATED_SUBTYPE_GLOBAL_PROFILE;
            case 29:
                return SUBTYPE_AGGRESSIVE_QREWRITE;
            case 30:
                return SUBTYPE_KOMODO;
            case 31:
                return DEPRECATED_SUBTYPE_GLOBAL_PLUSPAGE;
            case 32:
                return SUBTYPE_ROMAJI_NORMALIZATION;
            case 33:
                return DEPRECATED_SUBTYPE_CLEANUP_NON_ALPHANUM;
            case 34:
                return DEPRECATED_SUBTYPE_SAAS;
            case 35:
                return DEPRECATED_SUBTYPE_SOCIAL_HASHTAGS;
            case 36:
                return DEPRECATED_SUBTYPE_GLOBAL_HASHTAGS;
            case 37:
                return SUBTYPE_KANJI_ROMANIZED;
            case 38:
                return DEPRECATED_SUBTYPE_INFINITE;
            case 39:
                return SUBTYPE_PERSONAL;
            case 40:
                return DEPRECATED_SUBTYPE_LIVE_SPELLING_DID_YOU_MEAN;
            case 41:
                return DEPRECATED_SUBTYPE_UNIVERSAL;
            case 42:
                return SUBTYPE_IS_SQUIGGLY_LINE_ENABLED;
            case 43:
                return SUBTYPE_SOCIAL_PLUSPAGE;
            case 44:
                return SUBTYPE_PROMOTED_URL;
            case 45:
                return DEPRECATED_SUBTYPE_HYPERLOCAL;
            case 46:
                return SUBTYPE_DISAMBIGUATED_BY_ENTITIES;
            case 47:
                return DEPRECATED_SUBTYPE_ENTITY;
            case 48:
                return SUBTYPE_GMAIL;
            case cv.aT /*49*/:
                return SUBTYPE_DRIVE;
            case cv.aU /*50*/:
                return SUBTYPE_PHOTOS;
            case cv.aV /*51*/:
                return SUBTYPE_CALENDAR;
            case cv.aW /*52*/:
                return SUBTYPE_PLACEPRINT;
            case cv.aX /*53*/:
                return SUBTYPE_ECHOED_SEARCH_THE_WEB;
            case cv.aY /*54*/:
                return SUBTYPE_INLINEABLE;
            case cv.aZ /*55*/:
                return DEPRECATED_SUBTYPE_CHARACTER_REWRITES;
            case cv.ba /*56*/:
                return SUBTYPE_PREFETCH_ANSWER;
            case cv.bb /*57*/:
                return SUBTYPE_OMNIBOX_ECHO_SEARCH;
            case 58:
                return SUBTYPE_OMNIBOX_ECHO_URL;
            case cv.bc /*59*/:
                return SUBTYPE_OMNIBOX_HISTORY_SEARCH;
            case cv.bd /*60*/:
                return SUBTYPE_OMNIBOX_HISTORY_URL;
            case cv.be /*61*/:
                return SUBTYPE_OMNIBOX_HISTORY_TITLE;
            case cv.bf /*62*/:
                return SUBTYPE_OMNIBOX_HISTORY_BODY;
            case cv.bg /*63*/:
                return SUBTYPE_OMNIBOX_HISTORY_KEYWORD;
            case 64:
                return SUBTYPE_OMNIBOX_OTHER;
            case 65:
                return SUBTYPE_OMNIBOX_BOOKMARK_TITLE;
            case 66:
                return SUBTYPE_URL_BASED;
            case 67:
                return SUBTYPE_HIVEMIND;
            case 68:
                return DEPRECATED_SUBTYPE_COLLECTION_QREWRITE;
            case 69:
                return SUBTYPE_MAPS_HEAD_MODEL;
            case 70:
                return SUBTYPE_ANSWER;
            case 71:
                return SUBTYPE_REFINEMENTS;
            case 72:
                return SUBTYPE_MAPS_LOCAL_WEB;
            case 73:
                return SUBTYPE_ACTION_PHONE_CALL;
            case 74:
                return SUBTYPE_ACTION_SMS;
            case 75:
                return SUBTYPE_ACTION_SET;
            case 76:
                return SUBTYPE_ACTION_NAVIGATION;
            case 77:
                return SUBTYPE_ACTION_HTML_ANSWER;
            case 78:
                return SUBTYPE_ACTION_OPEN_APP;
            case 79:
                return SUBTYPE_ACTION_BUSINESS;
            case 80:
                return SUBTYPE_ACTION_CONTACT;
            case 81:
                return SUBTYPE_ACTION_LOCATION_REMINDER;
            case 82:
                return SUBTYPE_ACTION_ALARM;
            case afy.au /*83*/:
                return SUBTYPE_DISCOVERABILITY_SEARCHBOX_WITH_HOTWORD;
            case 84:
                return SUBTYPE_DISCOVERABILITY_CUECARD;
            case 85:
                return SUBTYPE_ACTION_TIME_REMINDER;
            case 86:
                return SUBTYPE_ACTION_EMAIL;
            case 87:
                return SUBTYPE_ACTION_DIRECTIONS;
            case 88:
                return SUBTYPE_ACTION_SELF_NOTE;
            case 89:
                return SUBTYPE_ACTION_AGENDA;
            case 90:
                return SUBTYPE_ACTION_PLAY_SONG;
            case 91:
                return SUBTYPE_ACTION_ADD_CALENDAR;
            case 92:
                return SUBTYPE_ACTION_START_RUN;
            case 93:
                return SUBTYPE_ACTION_WEATHER;
            case 94:
                return SUBTYPE_ACTION_CALCULATOR;
            case 95:
                return SUBTYPE_ACTION_DICTIONARY;
            case 96:
                return SUBTYPE_ACTION_STOCK;
            case 97:
                return SUBTYPE_ACTION_LOCAL;
            case 98:
                return SUBTYPE_ACTION_CONVERSION;
            case 99:
                return SUBTYPE_ACTION_MAP;
            case 100:
                return SUBTYPE_ACTION_ADDRESS;
            case 101:
                return SUBTYPE_ACTION_HOURS_OF_BUSINESS;
            case 102:
                return SUBTYPE_ACTION_DISTANCE;
            case 103:
                return SUBTYPE_ACTION_CURRENCY;
            case 104:
                return SUBTYPE_ACTION_TRANSLATION;
            case 105:
                return SUBTYPE_ACTION_FLIGHTS;
            case 106:
                return SUBTYPE_ACTION_TRAFFIC;
            case 107:
                return SUBTYPE_ACTION_IMAGES;
            case 108:
                return SUBTYPE_ACTION_VIDEOS;
            case 109:
                return SUBTYPE_ACTION_NEWS;
            case 110:
                return SUBTYPE_ACTION_SHOWTIMES;
            case 111:
                return SUBTYPE_PERSONAL_MAPS_FEATURE;
            case 112:
                return SUBTYPE_PERSONAL_MAPS_CATEGORY;
            case 113:
                return SUBTYPE_PERSONAL_MAPS_CONTACT;
            case 114:
                return SUBTYPE_PERSONAL_MAPS_ALIAS_HOME_WORK;
            case 115:
                return SUBTYPE_PERSONAL_MAPS_ALIAS_NICKNAME;
            case 116:
                return SUBTYPE_PERSONAL_MAPS_STAR;
            case 117:
                return SUBTYPE_PERSONAL_MAPS_REVIEW;
            case 118:
                return SUBTYPE_PERSONAL_MAPS_FLIGHT;
            case 119:
                return SUBTYPE_PERSONAL_MAPS_HOTEL_RESERVATION;
            case 120:
                return SUBTYPE_PERSONAL_MAPS_RESTAURANT_RESERVATION;
            case 121:
                return SUBTYPE_PERSONAL_MAPS_WEB_LOCAL;
            case afy.av /*122*/:
                return SUBTYPE_PERSONAL_MAPS_WEB_KNOWLEDGECARD;
            case 124:
                return SUBTYPE_PERSONAL_MAPS_EMBEDDED_LOAD_CLICK;
            case 125:
                return SUBTYPE_PERSONAL_MAPS_I_AM_HERE_CLICK;
            case 126:
                return SUBTYPE_DISCOVERABILITY_SEARCHBOX_WITH_TRY_SAYING;
            case 127:
                return SUBTYPE_DISCOVERABILITY_CUECARD_WITH_TRY_SAYING;
            case 128:
                return SUBTYPE_PERSONAL_MAPS_SINGLE_SUPPORT_QUERY;
            case 129:
                return SUBTYPE_PERSONAL_MAPS_NO_SUPPORT_QUERY;
            case 130:
                return SUBTYPE_ACTION_OFFLINE;
            case 131:
                return SUBTYPE_FRESH_RERANKED;
            case 132:
                return SUBTYPE_VOICE_PROMO_START_VOICE_INPUT;
            case 133:
                return DEPRECATED_SUBTYPE_VOICE_CORRECTION;
            case 134:
                return SUBTYPE_ICING_WEB;
            case 135:
                return SUBTYPE_OFFLINE_MAPS;
            case 136:
                return SUBTYPE_ICING_SEARCH_HISTORY;
            case 137:
                return SUBTYPE_ACTION_CHANGE_WIFI_SETTING;
            case 138:
                return SUBTYPE_ACTION_CHANGE_SOUND_SETTING;
            case 139:
                return SUBTYPE_ACTION_CHANGE_FLASHLIGHT_SETTING;
            case 140:
                return SUBTYPE_ACTION_CHANGE_BLUETOOTH_SETTING;
            case 141:
                return SUBTYPE_ACTION_CHANGE_DISPLAY_SETTING;
            case 142:
                return SUBTYPE_ACTION_PORKYPIG;
            case 143:
                return SUBTYPE_TRENDS;
            case 144:
                return SUBTYPE_MAPS_ADD_A_PLACE;
            case 145:
                return SUBTYPE_VOICE_PROMO_ZERO_PREFIX;
            case 146:
                return SUBTYPE_VOICE_SRP_TIP;
            case 147:
                return SUBTYPE_DISCOVERABILITY_VOICY;
            case 148:
                return SUBTYPE_FRESH_APP_RESULT;
            case 149:
                return SUBTYPE_DISCOVERABILITY_VOICY_WITH_TRY_SAYING;
            case 150:
                return SUBTYPE_LU_CATEGORICAL;
            case 151:
                return DEPRECATED_SUBTYPE_BROWSABLE_RECENT_SEARCHES;
            case 152:
                return DEPRECATED_SUBTYPE_BROWSABLE_WHATS_HOT;
            case 153:
                return DEPRECATED_SUBTYPE_BROWSABLE_NEARBY;
            case 154:
                return SUBTYPE_ONBOARDING;
            case 155:
                return SUBTYPE_FRESH_NEWS;
            case 156:
                return DEPRECATED_SUBTYPE_BROWSABLE_PREVIOUS;
            case 157:
                return SUBTYPE_DISCOVERABILITY_CUECARD_DOWN_ARROW;
            case 158:
                return SUBTYPE_DISCOVERABILITY_CUECARD_HEADLINES;
            case 159:
                return SUBTYPE_LAST_SLOT_TRANSLITERATION;
            case 160:
                return SUBTYPE_BRAIN;
            case 161:
                return SUBTYPE_IPA_CONTACT_RESULT;
            case 162:
                return SUBTYPE_IPA_MESSAGE_RESULT;
            case 163:
                return SUBTYPE_IPA_EMAIL_RESULT;
            case 164:
                return SUBTYPE_IPA_INSTALLED_APPS_RESULT;
            case 165:
                return SUBTYPE_IPA_STANDARD_RESULT;
            case 166:
                return SUBTYPE_LOCAL_MALL_BOOSTED_CATEGORY;
            case 167:
                return SUBTYPE_IPA_ERROR_RESULT;
            case 168:
                return SUBTYPE_BRAIN_ON_DEVICE;
            case 169:
                return SUBTYPE_MAPS_WAYPOINT_REFINEMENT;
            case 170:
                return SUBTYPE_IPA_USER_ONBOARDING_RESULT;
            case 171:
                return DEPRECATED_SUBTYPE_IPA_SECONDARY_INSTALLED_APPS;
            case 172:
                return SUBTYPE_PERSONAL_MAPS_PLACE_LIST_FEATURE;
            case 173:
                return SUBTYPE_WEB_ON_DEVICE_SUGGESTION;
            case 174:
                return SUBTYPE_IPA_SHORTCUT_PROMPT_RESULT;
            case 175:
                return SUBTYPE_LU_NAVIGATIONAL;
            case 176:
                return SUBTYPE_CLIPBOARD_TEXT;
            case 177:
                return SUBTYPE_CLIPBOARD_URL;
            case 178:
                return SUBTYPE_CLIPBOARD_INTENT;
            case 179:
                return SUBTYPE_TRENDS_RERANK;
            case 180:
                return SUBTYPE_LOCAL_MINI_APP_ECHOED_SUGGESTION;
            case 181:
                return SUBTYPE_IPA_CONTEXTUAL_ROUTINE_RESULT;
            case 182:
                return SUBTYPE_IPA_CONTEXTUAL_POPULAR_AT_PLACE_RESULT;
            case 183:
                return SUBTYPE_IPA_CONTEXTUAL_TRENDING_RESULT;
            case 185:
                return SUBTYPE_PERSONAL_MAPS_PLACE_LIST;
            case 186:
                return SUBTYPE_IPA_PHOTO_RESULT;
            case 187:
                return DEPRECATED_SUBTYPE_PERSONALIZED_LEGOS;
            case 188:
                return SUBTYPE_DINING_MINI_APP;
            case 189:
                return SUBTYPE_FUZZY_KEYBOARD;
            case 190:
                return SUBTYPE_OMNIBOX_NEARBY_URL;
            case 191:
                return SUBTYPE_OMNIBOX_NEARBY_URL_MULTIPLE;
            case 192:
                return SUBTYPE_DISCOVERABILITY_SEARCHBOX_QSB_HINT_TEXT_FOLLOWUP_IN_SUGGEST;
            case 193:
                return SUBTYPE_IPA_GWS_RESULT;
            case 194:
                return SUBTYPE_IPA_PERMISSION_RESULT;
            case 195:
                return SUBTYPE_IPA_CONTACT_APP_RESULT;
            case 196:
                return SUBTYPE_LU_CATEGORICAL_WITH_ICON;
            case 197:
                return SUBTYPE_LU_CATEGORICAL_FOOD_AND_DRINK;
            case 198:
                return SUBTYPE_LU_CATEGORICAL_LODGING;
            case 199:
                return SUBTYPE_LU;
            case 200:
                return DEPRECATED_SUBTYPE_ZP_OSCARS;
            case 201:
                return DEPRECATED_SUBTYPE_INSTANT_APP_PARTNER_DOMAIN_FOUND;
            case 202:
                return SUBTYPE_LU_CATEGORICAL_WITHOUT_ICON;
            case 203:
                return SUBTYPE_ULP;
            case 204:
                return SUBTYPE_COUNTERFACTUAL_DUMMY;
            case 205:
                return SUBTYPE_PIVOT_QUERY;
            case 206:
                return SUBTYPE_IPA_GMAIL_INTELLIGENCE_RESULT;
            case 207:
                return SUBTYPE_IPA_GMAIL_INTELLIGENCE_FLIGHT_RESULT;
            case 208:
                return SUBTYPE_IPA_GMAIL_INTELLIGENCE_ORDER_RESULT;
            case 209:
                return DEPRECATED_SUBTYPE_IPA_PEOPLE_RESULT;
            case 210:
                return SUBTYPE_IPA_APPLY_CATEGORY_FILTER;
            case 211:
                return SUBTYPE_IPA_CLEAR_CATEGORY_FILTER;
            case 212:
                return SUBTYPE_KEYBOARD_PREDICTION;
            case 213:
                return DEPRECATED_SUBTYPE_CUSCO;
            case 214:
                return SUBTYPE_IPA_APPLY_APP_FILTER;
            case 215:
                return SUBTYPE_IPA_CLEAR_APP_FILTER;
            case 216:
                return SUBTYPE_ICING_MESSAGE_RESULT;
            case 217:
                return SUBTYPE_IPA_CLEAR_PEOPLE_IMMERSIVE_FILTER;
            case 218:
                return SUBTYPE_ICING_DOCUMENT_RESULT;
            case 219:
                return SUBTYPE_CACHED_SEARCH_RESULTS;
            case 220:
                return SUBTYPE_WORD_BY_WORD_OFFLINE_MODEL;
            case 221:
                return SUBTYPE_IPA_PEOPLE_IMMERSIVE_HEADER;
            case 222:
                return SUBTYPE_IPA_PEOPLE_CLUSTER;
            case 223:
                return SUBTYPE_PIXEL_APPS;
            case 224:
                return SUBTYPE_IPA_NOTIFICATION_ONBOARDING_RESULT;
            case 225:
                return SUBTYPE_ZP_RAMADAN;
            case 226:
                return SUBTYPE_CONTACTS_MODE_CONTACT_RESULT;
            case 227:
                return SUBTYPE_CONTEXT_BRAIN;
            case 228:
                return SUBTYPE_VASCO;
            case 229:
                return SUBTYPE_PERSONALIZED_PULSAR;
            case 230:
                return DEPRECATED_SUBTYPE_PIXEL_CONTACTS;
            case 231:
                return SUBTYPE_ZAGAT_LIST;
            case 232:
                return SUBTYPE_PIPS_ULYSSES_SUGGEST;
            case 233:
                return SUBTYPE_IPA_CHIP;
            case 234:
                return SUBTYPE_IPA_LINK;
            case 235:
                return SUBTYPE_ICING_VIDEO_RESULT;
            case 236:
                return SUBTYPE_IPA_NOTIFICATION_LARGE_CARD_RESULT;
            case 237:
                return SUBTYPE_IPA_CLEAR_CHIP;
            case 238:
                return SUBTYPE_ICING_SMS_RESULT;
            case 239:
                return SUBTYPE_ASSISTANT_FOLLOW_UP_QUERY;
            case 240:
                return SUBTYPE_IPA_GMAIL_INTELLIGENCE_HOTEL_RESERVATION_RESULT;
            case 241:
                return SUBTYPE_IPA_GMAIL_INTELLIGENCE_CAR_RENTAL_RESERVATION_RESULT;
            case 242:
                return SUBTYPE_IPA_GMAIL_INTELLIGENCE_RESTAURANT_RESERVATION_RESULT;
            case 243:
                return SUBTYPE_IPA_GMAIL_INTELLIGENCE_SOCIAL_EVENT_RESULT;
            case 244:
                return SUBTYPE_RICH_TUHMBNAIL;
            case 245:
                return SUBTYPE_ANSWER_PLAYINSTALL;
            case 246:
                return SUBTYPE_ICING_RESERVATION_RESULT;
            case 247:
                return SUBTYPE_ICING_FLIGHT_RESULT;
            case 248:
                return SUBTYPE_ICING_WEB_IDD;
            case 249:
                return SUBTYPE_ANSWER_DICTIONARY;
            case 250:
                return SUBTYPE_ANSWER_FINANCE;
            case 251:
                return SUBTYPE_ANSWER_GENERIC_ANSWER;
            case 252:
                return DEPRECATED_SUBTYPE_ANSWER_LOCAL;
            case 253:
                return SUBTYPE_ANSWER_SPORTS;
            case 254:
                return SUBTYPE_ANSWER_SUNRISE_SUNSET;
            case 255:
                return SUBTYPE_ANSWER_TRANSLATION;
            case 256:
                return SUBTYPE_ANSWER_WEATHER;
            case 257:
                return SUBTYPE_ANSWER_WHEN_IS;
            case 258:
                return SUBTYPE_ANSWER_CURRENCY;
            case 259:
                return SUBTYPE_ANSWER_LOCAL_TIME;
            case 260:
                return SUBTYPE_IPA_CALENDAR_EVENT;
            case 261:
                return SUBTYPE_IPA_CHROME;
            case 262:
                return SUBTYPE_IPA_PERSONALIZED_ONBOARDING_RESULT;
            case 263:
                return SUBTYPE_TOKEN_RERANK;
            case 264:
                return DEPRECATED_SUBTYPE_GAME_RERANK;
            case 265:
                return SUBTYPE_ANIMA_ENTITY_RERANK;
            case 266:
                return SUBTYPE_SALIENT_TERMS_RERANK;
            case 267:
                return SUBTYPE_LU_SUGGESTED_SET;
            case 268:
                return SUBTYPE_IPA_GOOGLE_MAPS;
            case 269:
                return SUBTYPE_ICING_PLACE_RESULT;
            case 270:
                return SUBTYPE_LU_PROMOTED_CATEGORICAL;
            case 271:
                return SUBTYPE_SUGGEST_2G_LITE;
            case 272:
                return DEPRECATED_SUBTYPE_IPA_RECENTS_RESULT;
            case 273:
                return SUBTYPE_HOBBES_SUGGEST;
            case 274:
                return DEPRECATED_SUBTYPE_IPA_RECENTS_FILTER_MODE_RESULT;
            case 275:
                return SUBTYPE_AUTO_EXPAND_SUGGESTION;
            case 276:
                return SUBTYPE_IPA_GMAIL_INTELLIGENCE_TRANSPORTATION_RESULT;
            case 277:
                return SUBTYPE_CURATED_NEWS;
            case 278:
                return SUBTYPE_PIPS_GENX_HYPERLOCAL_SUGGEST;
            case 279:
                return SUBTYPE_PERSONAL_IMAGE;
            case 280:
                return SUBTYPE_PERSONAL_NEWS;
            case 281:
                return SUBTYPE_PERSONAL_YOUTUBE;
            case 282:
                return SUBTYPE_PERSONAL_MAPS;
            case 283:
                return SUBTYPE_PERSONAL_WEB;
            case 284:
                return DEPRECATED_SUBTYPE_ICING_SLICE;
            case 285:
                return SUBTYPE_ANSWER_BLOCKING_FETCH;
            case 286:
                return SUBTYPE_ICING_APP_SLICE;
            case 287:
                return SUBTYPE_NEW_USER_PREDEFINED;
            case 288:
                return SUBTYPE_ISTA_RERANK;
            case 289:
                return SUBTYPE_PERSONAL_TAIL;
            case 290:
                return SUBTYPE_ZP_WORLDCUP;
            case 291:
                return SUBTYPE_LU_CHAIN;
            case 292:
                return SUBTYPE_MORE_RECENT_SEARCHES;
            case 293:
                return SUBTYPE_NEXT_WORD_BASED_ON_0_PREVIOUS_WORDS;
            case 294:
                return SUBTYPE_NEXT_WORD_BASED_ON_1_PREVIOUS_WORDS;
            case 295:
                return SUBTYPE_ZP_WORLDCUP_COUNTRY;
            case 296:
                return SUBTYPE_ZERO_PREFIX_ICING;
            case 297:
                return SUBTYPE_RECIPES;
            case 298:
                return SUBTYPE_ICING_LIVE_SLICE;
            case 299:
                return SUBTYPE_PRODLM;
            case 300:
                return SUBTYPE_SLICE_PREWARM_ONLY;
            case 301:
                return SUBTYPE_PERSONALIZED_FRESH_PULSAR;
            case 302:
                return SUBTYPE_PERSONAL_IME;
            case 303:
                return SUBTYPE_PERSONAL_TRANSLIT;
            case 304:
                return SUBTYPE_PERSONAL_SPELLING;
            case 305:
                return SUBTYPE_PERSONAL_PREFIX_SPELLING;
            case 306:
                return SUBTYPE_PERSONAL_BAG_OF_WORDS;
            case 307:
                return SUBTYPE_ZP_MLB;
            case 308:
                return SUBTYPE_PROACTIVE_ZPS;
            case 309:
                return SUBTYPE_TRENDS_ENTITY_SMEARED_RERANK;
            case 310:
                return SUBTYPE_LU_POI_PROMINENCE;
            case 311:
                return SUBTYPE_LU_POI_DISTANCE;
            case 312:
                return SUBTYPE_ACCENTUATE_QUERY_BUILDER;
            case 313:
                return SUBTYPE_PIPS_DISABLE_PSUGGEST;
            case 314:
                return SUBTYPE_ACTION;
            case 315:
                return SUBTYPE_ACTION_AT_ZERO;
            case 316:
                return SUBTYPE_PIPS_HYPERLOCAL;
            case 317:
                return SUBTYPE_VOZ_ESCAPE_HATCH;
            case 318:
                return SUBTYPE_IPA_LG_SETTINGS_BUTTON;
            case 319:
                return SUBTYPE_UVP_RERANK;
            case 320:
                return SUBTYPE_ANSWER_LOOK_UP;
            case 321:
                return SUBTYPE_LU_CHAIN_WITH_MODIFIER;
            case 322:
                return SUBTYPE_EXPERIMENTAL_CATEGORY;
            case 323:
                return SUBTYPE_ELIGIBLE_FOR_SLICE_UPGRADE;
            case 324:
                return SUBTYPE_LANGUAGE_LEVEL_FRESH;
            case 325:
                return SUBTYPE_SLICE_RENDERED;
            case 326:
                return SUBTYPE_SLICE_OVERRIDE;
            case 327:
                return SUBTYPE_CLIPBOARD_IMAGE;
            case 328:
                return SUBTYPE_PERSONALIZED_ZERO_PREFIX_PULSAR;
            case 329:
                return SUBTYPE_IMAGE_MODE;
            case 330:
                return SUBTYPE_IMAGE_MODE_TRIGGER;
            case 331:
                return SUBTYPE_FOLLOW_LURE_BASEBALL;
            case 332:
                return SUBTYPE_USE_AS_HINT_TEXT;
            case 333:
                return SUBTYPE_RANKEMBED;
            case 334:
                return SUBTYPE_MAPS_INJECTED_CATEGORY;
            case 335:
                return SUBTYPE_MONDEGREEN;
            case 336:
                return SUBTYPE_FOLLOW_LURE_CRICKET_WORLD_CUP_2019;
            case 337:
                return SUBTYPE_TOPIC_FEED;
            default:
                return null;
        }
    }

    public static anxx a() {
        return aodq.a;
    }

    private aodn(int i) {
        this.b = i;
    }

    public final String toString() {
        return Integer.toString(this.b);
    }
}
