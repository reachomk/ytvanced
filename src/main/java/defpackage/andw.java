package defpackage;

/* renamed from: andw */
public enum andw implements anxv {
    UNKNOWN_EVENT_TYPE(0),
    START_LAUNCHER(1),
    GET_INSTALLED_APPLICATIONS(2),
    START_APPLICATION(3),
    STOP_APPLICATION(4),
    GO_TO_STORE(5),
    SWITCH_HEAD_MOUNT(6),
    SETUP_WELCOME_NEXT(11),
    SETUP_WELCOME_GET_VIEWER(12),
    SETUP_WELCOME_SWITCH_VIEWER(13),
    SETUP_WELCOME_USE_VIEWER(14),
    SETUP_QR_CODE_SCAN_SKIP(7),
    SETUP_QR_CODE_SCAN(8),
    SETUP_QR_CODE_HELP(15),
    SETUP_PAIRED_NEXT(16),
    SETUP_HEAD_MOUNT_INSERTED(17),
    SETUP_HEAD_MOUNT_SWITCH(18),
    SETUP_VR_INTRO_START(19),
    SETUP_VR_INTRO_STOP(20),
    SETTINGS_QR_CODE_SCAN(9),
    SETTINGS_QR_CODE_SCAN_SKIP(10),
    SETTINGS_QR_CODE_HELP(21),
    MY_APPS_TAB(22),
    FEATURED_APPS_TAB(23),
    NAV_ITEM_SELECTED(24),
    CYCLOPS_APPLICATION(1000),
    CYCLOPS_SHARE(1001),
    CYCLOPS_RECEIVE(1002),
    CYCLOPS_DELETE(1003),
    CYCLOPS_VIEW(1004),
    CYCLOPS_VIEW_HMD(1005),
    CYCLOPS_CAPTURE(1006),
    CYCLOPS_GALLERY_CONTEXT_MENU(1007),
    CYCLOPS_GALLERY_TO_GALLERY_HMD(1008),
    CYCLOPS_GALLERY_TO_CAPTURE(1009),
    CYCLOPS_SETTINGS(1010),
    CYCLOPS_ACCOUNT_SWITCH(1011),
    CYCLOPS_FEEDBACK(1012),
    CYCLOPS_SHARE_START(1013),
    START_SDK_APPLICATION(2000),
    TRANSITION_HEAD_MOUNT_INSERTED(2001),
    TRANSITION_HEAD_MOUNT_SWITCH(2002),
    SDK_PERFORMANCE_REPORT(2003),
    SDK_SENSOR_REPORT(2004),
    START_VR_APPLICATION(2005),
    STOP_VR_APPLICATION(2006),
    SDK_SCANLINE_RACING_ENABLED(2007),
    SDK_SCANLINE_RACING_VSYNC_OVERSHOOT_FATAL(2008),
    SDK_SENSOR_STALL(2009),
    SDK_DEVICE_IDLE_ON(2010),
    SDK_DEVICE_IDLE_OFF(2011),
    SDK_PHONE_ALIGNMENT(2012),
    SDK_SET_EXTERNAL_SURFACE(2013),
    PERFORMANCE_OVERLAY_ENABLED(2014),
    PERFORMANCE_OVERLAY_DISABLED(2015),
    SDK_GRAPHICS_REPORT(2016),
    SDK_COMPOSITOR_INITIALIZED(2017),
    START_VR_LAUNCHER_COLD(3000),
    LAUNCHER_START_APPLICATION(3001),
    LAUNCHER_STOP_APPLICATION(3002),
    AUDIO_INITIALIZATION(4000),
    AUDIO_SHUTDOWN(4001),
    AUDIO_PERFORMANCE_REPORT(4002),
    LULLABY_MUTE(5000),
    LULLABY_UNMUTE(5001),
    LULLABY_IMPRESSION(5002),
    LULLABY_ACTION(5003),
    LULLABY_LOAD(5004),
    EMBEDVR_START_SESSION(6000),
    EMBEDVR_STOP_SESSION(6001),
    EMBEDVR_LOAD_SUCCESS(6002),
    EMBEDVR_LOAD_ERROR(6003),
    EMBEDVR_VIEW_CLICK(6004),
    EMBEDVR_VIDEO_PLAY(6005),
    EMBEDVR_VIDEO_PAUSE(6006),
    EMBEDVR_VIDEO_SEEK_TO(6007),
    EMBEDVR_PERFORMANCE_REPORT(6008),
    VRCORE_COMMON_ENABLE_VRMODE(7000),
    VRCORE_COMMON_DISABLE_VRMODE(7001),
    VRCORE_COMMON_CONTINUE_VRMODE(7002),
    VRCORE_COMMON_PERMISSION_GRANTED(7203),
    VRCORE_COMMON_PERMISSION_DENIED(7204),
    VRCORE_COMMON_CLIENT_DIED(7048),
    VRCORE_COMMON_ERROR(7049),
    VRCORE_CONTROLLER_CONNECTED(7050),
    VRCORE_CONTROLLER_ERROR(7051),
    VRCORE_CONTROLLER_OTA_ERROR(7052),
    VRCORE_CONTROLLER_OTA_STARTED(7053),
    VRCORE_CONTROLLER_OTA_SUCCESS(7054),
    VRCORE_CONTROLLER_OTA_SUCCESS_TRIVIAL(7055),
    VRCORE_CONTROLLER_OTA_DATA_TRANSFER_SUCCESS(7056),
    VRCORE_CONTROLLER_PAIRING_ERROR(7057),
    VRCORE_CONTROLLER_PAIRING_STARTED(7058),
    VRCORE_CONTROLLER_PAIRING_SUCCESS(7059),
    VRCORE_CONTROLLER_RECALIBRATED(7060),
    VRCORE_CONTROLLER_RECALIBRATION_ERROR(7061),
    VRCORE_CONTROLLER_SLEPT_END(7062),
    VRCORE_CONTROLLER_SLEPT_IDLE(7063),
    VRCORE_CONTROLLER_VOLUME_ADJUSTED(7064),
    VRCORE_CONTROLLER_EMULATOR_CONNECTED(7065),
    VRCORE_CONTROLLER_EMULATOR_ERROR(7066),
    VRCORE_CONTROLLER_RAIL_REPORT(7067),
    VRCORE_CONTROLLER_STUCK_NOTIFICATION_SHOWN(7068),
    VRCORE_CONTROLLER_STUCK_EXITED_VR(7069),
    VRCORE_CONTROLLER_STUCK_NOTIFICATION_TAPPED(7070),
    VRCORE_CONTROLLER_OTA_DATA_TRANSFER_STARTED(7071),
    VRCORE_CONTROLLER_RECOVERY_MODE(7072),
    VRCORE_CONTROLLER_SLODR_DETECTED(7073),
    VRCORE_CONTROLLER_HANDEDNESS_SWITCHED(7074),
    VRCORE_CONTROLLER_DISCONNECTED(7075),
    VRCORE_NFC_TRIGGER_INTENT(7100),
    VRCORE_NFC_ERROR(7149),
    VRCORE_NOTIFICATION_POSTED(7150),
    VRCORE_NOTIFICATION_REMOVED(7151),
    VRCORE_NOTIFICATION_ERROR(7199),
    VRCORE_SETTINGS_LAUNCHED(7200),
    VRCORE_SETTINGS_ENABLE_NOTIFICATION(7201),
    VRCORE_SETTINGS_DISABLE_NOTIFICATION(7202),
    VRCORE_SETTINGS_ERROR(7249),
    VRCORE_DAYDREAM_DON_STARTED(7250),
    VRCORE_DAYDREAM_DON_SUCCESS(7251),
    VRCORE_DAYDREAM_DON_ERROR(7252),
    VRCORE_DAYDREAM_SESSION_STARTED(7253),
    VRCORE_DAYDREAM_SESSION_ENDED(7254),
    VRCORE_DAYDREAM_HOME_LAUNCHED(7255),
    VRCORE_DAYDREAM_METAWORLD_STARTED(7256),
    VRCORE_DAYDREAM_METAWORLD_DISMISSED(7257),
    VRCORE_DAYDREAM_SYSTEM_UPDATE_ACCEPTED(7258),
    VRCORE_DAYDREAM_SYSTEM_UPDATE_DECLINED(7259),
    VRCORE_CAPTURE_ERROR(7350),
    VRCORE_CAPTURE_START_CASTING(7351),
    VRCORE_CAPTURE_STOP_CASTING(7352),
    VRCORE_CAPTURE_STOP_CASTING_ON_DOFF(7356),
    VRCORE_CAPTURE_SAVING_SCREENSHOT(7353),
    VRCORE_CAPTURE_STARTING_VIDEO_RECORDING(7354),
    VRCORE_CAPTURE_STOPPING_VIDEO_RECORDING(7355),
    VRCORE_CAPTURE_REQUESTING_FS_PERMISSION(7357),
    VRCORE_CAPTURE_FS_PERMISSION_GRANTED(7358),
    VRCORE_CAPTURE_FS_PERMISSION_DENIED(7359),
    VRCORE_LOCK_SCREEN_EVENT(7995),
    VRCORE_HEAD_TRACKING_REPORT(7996),
    VRCORE_GRAPHICS_REPORT(7997),
    VRCORE_DASHBOARD_EVENT(7998),
    VRCORE_PERFORMANCE_REPORT(7999),
    EARTHVR_APP_STARTED(8000),
    EARTHVR_APP_STOPPED(8001),
    EARTHVR_APP_IDLE(8002),
    EARTHVR_APP_MODE_ENTERED(8003),
    EARTHVR_APP_MODE_EXITED(8004),
    EARTHVR_APP_PREFERENCES_CHANGED(8005),
    EARTHVR_APP_ENVIRONMENT_CHANGED(8006),
    EARTHVR_APP_INITIALIZED(8007),
    EARTHVR_APP_SDK_FORCED_SHUTDOWN(8008),
    EARTHVR_FORCE_HUMAN_SCALE_CHANGED(8009),
    EARTHVR_NAVIGATION_ARCBALL_STARTED(8100),
    EARTHVR_NAVIGATION_ARCBALL_UPDATED(8101),
    EARTHVR_NAVIGATION_ARCBALL_STOPPED(8102),
    EARTHVR_NAVIGATION_FLYING_STARTED(8103),
    EARTHVR_NAVIGATION_FLYING_UPDATED(8104),
    EARTHVR_NAVIGATION_FLYING_STOPPED(8105),
    EARTHVR_NAVIGATION_SKY_TIME_TRAVELING_STARTED(8106),
    EARTHVR_NAVIGATION_SKY_TIME_TRAVELING_UPDATED(8107),
    EARTHVR_NAVIGATION_SKY_TIME_TRAVELING_STOPPED(8108),
    EARTHVR_NAVIGATION_ROTATING_STARTED(8109),
    EARTHVR_NAVIGATION_ROTATING_UPDATED(8110),
    EARTHVR_NAVIGATION_ROTATING_STOPPED(8111),
    EARTHVR_NAVIGATION_TRANSITION_STARTED(8150),
    EARTHVR_NAVIGATION_TRANSITION_STOPPED(8151),
    EARTHVR_RENDERING_TUNNEL_VISION_APPEARED(8200),
    EARTHVR_RENDERING_TUNNEL_VISION_DISAPPEARED(8201),
    EARTHVR_MENU_OPENED(8300),
    EARTHVR_MENU_CLOSED(8301),
    EARTHVR_MENU_PREFERENCES_OPENED(8302),
    EARTHVR_MENU_PREFERENCES_CLOSED(8303),
    EARTHVR_MENU_CATEGORY_SELECTED(8304),
    EARTHVR_MENU_PAGE_CHANGED(8305),
    EARTHVR_MENU_CARD_CLICKED(8306),
    EARTHVR_MENU_PLACE_DELETION_REQUESTED(8307),
    EARTHVR_DESKTOP_WINDOW_MENU_ITEM_SELECTED(8308),
    EARTHVR_SEARCH_OPENED(8309),
    EARTHVR_SEARCH_CLOSED(8310),
    EARTHVR_SEARCH_ENTITY_SELECTED(8311),
    EARTHVR_SEARCH_PIN_DISMISSED(8312),
    EARTHVR_SEARCH_PIN_EXPIRED(8313),
    EARTHVR_MENU_COPYRIGHT_OPENED(8314),
    EARTHVR_MENU_COPYRIGHT_CLOSED(8315),
    EARTHVR_TOUR_PAUSED(8400),
    EARTHVR_TOUR_RESUMED(8401),
    EARTHVR_TOUR_COMPLETED(8402),
    EARTHVR_TUTORIAL_STAGE_CHANGED(8403),
    EARTHVR_TOUR_STARTED(8404),
    EARTHVR_SPLASH_SCREEN_EXITED(8405),
    EARTHVR_PLACE_SAVED(8500),
    EARTHVR_REVEAL_QUERY_STARTED(8501),
    EARTHVR_REVEAL_QUERY_RESULT_READY(8502),
    EARTHVR_MINIGLOBE_BECAME_LARGE(8503),
    EARTHVR_MINIGLOBE_BECAME_SMALL(8504),
    EARTHVR_MINIGLOBE_ROTATED(8505),
    EARTHVR_MINIGLOBE_TELEPORT_TRIGGERED(8506),
    EARTHVR_ACTION_ORB_EXPANSION_STATE_CHANGED(8507),
    EARTHVR_ACTION_ORB_DISPLAY_MODE_CHANGED(8508),
    EARTHVR_STREET_VIEW_STATE_CHANGED(8550),
    EARTHVR_STREET_VIEW_PANO_PREVIEW_LOADED(8551),
    EARTHVR_STREET_VIEW_PANO_HI_RES_PREVIEW_LOADED(8552),
    EARTHVR_STREET_VIEW_PANO_MIRTH_LOADED(8553),
    EARTHVR_STREET_VIEW_USER_DISCOVERED_NEIGHBOR(8554),
    KEYBOARD_EVENT(9000),
    STREET_VIEW_COLLECTION(10000),
    STREET_VIEW_PANO_IN_COLLECTION(10001),
    STREET_VIEW_PANO_IN_SEARCH_RESULTS(10002),
    STREET_VIEW_NO_KEYBOARD(10003),
    STREET_VIEW_SEARCH_START(10004),
    STREET_VIEW_SEARCH_RESULTS(10005),
    STREET_VIEW_SEARCH_NO_RESULTS(10006),
    STREET_VIEW_SEARCH_DISMISS(10007),
    STREET_VIEW_SEARCH_EDIT(10008),
    STREET_VIEW_PANO_NAV_SESSION(10009),
    STREET_VIEW_APP_BUTTON(10010),
    STREET_VIEW_SEARCH_NO_PANOS(10011),
    STREET_VIEW_SEARCH_REQUIRES_GMS_CORE_UPDATE(10012),
    STREET_VIEW_TUTORIAL_SESSION(10013),
    PHOTOS_APPLICATION(11000),
    PHOTOS_GALLERY_NEXT(11010),
    PHOTOS_GALLERY_PREV(11011),
    PHOTOS_GALLERY_SCRUB_DRAG(11012),
    PHOTOS_GALLERY_TAB_CHANGE(11013),
    PHOTOS_ACCOUNT_CHANGE(11020),
    PHOTOS_ACCOUNT_INVALID(11021),
    PHOTOS_OPEN_MEDIA(11030),
    PHOTOS_CAROUSEL_NEXT(11031),
    PHOTOS_CAROUSEL_PREV(11032),
    PHOTOS_CC_CARD_SHOWN(11040),
    PHOTOS_CC_CARD_DISMISS(11041),
    PHOTOS_CC_CARD_SUCCESS(11042),
    PHOTOS_BACKUP_CARD_SHOWN(11050),
    PHOTOS_BACKUP_CARD_DISMISS(11051),
    PHOTOS_BACKUP_CARD_SUCCESS(11052),
    PHOTOS_SIGN_CARD_SHOWN(11060),
    PHOTOS_WARM_WELCOME_SHOWN(11061),
    VRHOME_SETUP_STEP_START(12000),
    VRHOME_SETUP_STEP_END(12001),
    VRHOME_SETUP_STEP_STATE_CHANGE(12002),
    VRHOME_GCONFIG_UPDATED(12003),
    VRHOME_GET_VIEWER_CLICK(12004),
    VRHOME_DIALOG_ACTION(12005),
    JUMP_INSPECTOR_APP_STARTED(13000),
    JUMP_INSPECTOR_PLAYBACK(13001),
    JUMP_INSPECTOR_PICKER(13002),
    JUMP_INSPECTOR_OPEN_SETTINGS(13003),
    JUMP_INSPECTOR_ADD_TO_HOME_SCREEN(13004),
    JUMP_INSPECTOR_OPEN_FAQ(13005),
    JUMP_INSPECTOR_ERROR(13006),
    STREAMING_APP_START(14000),
    STREAMING_FRAMES(14001),
    TOUR_STARTED(15000),
    TOUR_ENDED(15001),
    TANGO_6DOF_FAILURE(16000),
    TANGO_6DOF_RECOVERY(16001),
    TANGO_FLOOR_HEIGHT_CHANGE(16002),
    STANDALONE_POWER_STATE(17000),
    STANDALONE_MEMORY_STATS(17001),
    STANDALONE_HEADSET_ON(17002),
    STANDALONE_HEADSET_OFF(17003),
    STANDALONE_IDLE_ENTER(17004),
    STANDALONE_IDLE_EXIT(17005),
    STANDALONE_IDLE_SHOW_WARNING(17006),
    STANDALONE_IDLE_WARNING_DISMISSED(17007),
    EVA_APPLICATION(18000),
    EVA_PAIRING(18001),
    EVA_CAPTURE(18002),
    EVA_FILE_TRANSFER(18003),
    EVA_VIEW(18004),
    EVA_CAMERA_STATUS(18005),
    EVA_BLUETOOTH_SESSION(18006),
    EVA_WIFI_SETUP_SESSION(18007),
    EVA_SHARE(18008),
    EVA_CAMERA_CRASH(18009),
    EVA_DELETE(18010),
    EVA_WIGGLEGRAM_GENERATED(18011),
    EVA_EXPORT_MEDIA(18012),
    EVA_CAMERA_FIRMWARE_UPDATE(18013),
    EVA_SELECTION_ACTION(18014),
    VR180_CREATOR_START(19000),
    VR180_CREATOR_VIDEO_CONVERT(19001),
    VR180_CREATOR_VIDEO_PUBLISH(19002),
    VR180_CREATOR_PHOTO_SPLIT(19003),
    VR180_CREATOR_PHOTO_MERGE(19004),
    VR180_CREATOR_PHOTO_CONVERT(19005),
    VR180_CREATOR_VIDEO_STITCH(19006);
    
    public final int c;

    public final int getNumber() {
        return this.c;
    }

    public static andw a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_EVENT_TYPE;
            case 1:
                return START_LAUNCHER;
            case 2:
                return GET_INSTALLED_APPLICATIONS;
            case 3:
                return START_APPLICATION;
            case 4:
                return STOP_APPLICATION;
            case 5:
                return GO_TO_STORE;
            case 6:
                return SWITCH_HEAD_MOUNT;
            case 7:
                return SETUP_QR_CODE_SCAN_SKIP;
            case 8:
                return SETUP_QR_CODE_SCAN;
            case 9:
                return SETTINGS_QR_CODE_SCAN;
            case 10:
                return SETTINGS_QR_CODE_SCAN_SKIP;
            case 11:
                return SETUP_WELCOME_NEXT;
            case 12:
                return SETUP_WELCOME_GET_VIEWER;
            case 13:
                return SETUP_WELCOME_SWITCH_VIEWER;
            case 14:
                return SETUP_WELCOME_USE_VIEWER;
            case 15:
                return SETUP_QR_CODE_HELP;
            case 16:
                return SETUP_PAIRED_NEXT;
            case 17:
                return SETUP_HEAD_MOUNT_INSERTED;
            case 18:
                return SETUP_HEAD_MOUNT_SWITCH;
            case 19:
                return SETUP_VR_INTRO_START;
            case 20:
                return SETUP_VR_INTRO_STOP;
            case 21:
                return SETTINGS_QR_CODE_HELP;
            case 22:
                return MY_APPS_TAB;
            case 23:
                return FEATURED_APPS_TAB;
            case 24:
                return NAV_ITEM_SELECTED;
            default:
                switch (i) {
                    case 1000:
                        return CYCLOPS_APPLICATION;
                    case 1001:
                        return CYCLOPS_SHARE;
                    case 1002:
                        return CYCLOPS_RECEIVE;
                    case 1003:
                        return CYCLOPS_DELETE;
                    case 1004:
                        return CYCLOPS_VIEW;
                    case 1005:
                        return CYCLOPS_VIEW_HMD;
                    case 1006:
                        return CYCLOPS_CAPTURE;
                    case 1007:
                        return CYCLOPS_GALLERY_CONTEXT_MENU;
                    case 1008:
                        return CYCLOPS_GALLERY_TO_GALLERY_HMD;
                    case 1009:
                        return CYCLOPS_GALLERY_TO_CAPTURE;
                    case 1010:
                        return CYCLOPS_SETTINGS;
                    case 1011:
                        return CYCLOPS_ACCOUNT_SWITCH;
                    case 1012:
                        return CYCLOPS_FEEDBACK;
                    case 1013:
                        return CYCLOPS_SHARE_START;
                    default:
                        switch (i) {
                            case 2000:
                                return START_SDK_APPLICATION;
                            case 2001:
                                return TRANSITION_HEAD_MOUNT_INSERTED;
                            case 2002:
                                return TRANSITION_HEAD_MOUNT_SWITCH;
                            case 2003:
                                return SDK_PERFORMANCE_REPORT;
                            case 2004:
                                return SDK_SENSOR_REPORT;
                            case 2005:
                                return START_VR_APPLICATION;
                            case 2006:
                                return STOP_VR_APPLICATION;
                            case 2007:
                                return SDK_SCANLINE_RACING_ENABLED;
                            case 2008:
                                return SDK_SCANLINE_RACING_VSYNC_OVERSHOOT_FATAL;
                            case 2009:
                                return SDK_SENSOR_STALL;
                            case 2010:
                                return SDK_DEVICE_IDLE_ON;
                            case 2011:
                                return SDK_DEVICE_IDLE_OFF;
                            case 2012:
                                return SDK_PHONE_ALIGNMENT;
                            case 2013:
                                return SDK_SET_EXTERNAL_SURFACE;
                            case 2014:
                                return PERFORMANCE_OVERLAY_ENABLED;
                            case 2015:
                                return PERFORMANCE_OVERLAY_DISABLED;
                            case 2016:
                                return SDK_GRAPHICS_REPORT;
                            case 2017:
                                return SDK_COMPOSITOR_INITIALIZED;
                            default:
                                switch (i) {
                                    case 3000:
                                        return START_VR_LAUNCHER_COLD;
                                    case 3001:
                                        return LAUNCHER_START_APPLICATION;
                                    case 3002:
                                        return LAUNCHER_STOP_APPLICATION;
                                    default:
                                        switch (i) {
                                            case 4000:
                                                return AUDIO_INITIALIZATION;
                                            case 4001:
                                                return AUDIO_SHUTDOWN;
                                            case 4002:
                                                return AUDIO_PERFORMANCE_REPORT;
                                            default:
                                                switch (i) {
                                                    case 5000:
                                                        return LULLABY_MUTE;
                                                    case 5001:
                                                        return LULLABY_UNMUTE;
                                                    case 5002:
                                                        return LULLABY_IMPRESSION;
                                                    case 5003:
                                                        return LULLABY_ACTION;
                                                    case 5004:
                                                        return LULLABY_LOAD;
                                                    default:
                                                        switch (i) {
                                                            case 6000:
                                                                return EMBEDVR_START_SESSION;
                                                            case 6001:
                                                                return EMBEDVR_STOP_SESSION;
                                                            case 6002:
                                                                return EMBEDVR_LOAD_SUCCESS;
                                                            case 6003:
                                                                return EMBEDVR_LOAD_ERROR;
                                                            case 6004:
                                                                return EMBEDVR_VIEW_CLICK;
                                                            case 6005:
                                                                return EMBEDVR_VIDEO_PLAY;
                                                            case 6006:
                                                                return EMBEDVR_VIDEO_PAUSE;
                                                            case 6007:
                                                                return EMBEDVR_VIDEO_SEEK_TO;
                                                            case 6008:
                                                                return EMBEDVR_PERFORMANCE_REPORT;
                                                            default:
                                                                switch (i) {
                                                                    case 7000:
                                                                        return VRCORE_COMMON_ENABLE_VRMODE;
                                                                    case 7001:
                                                                        return VRCORE_COMMON_DISABLE_VRMODE;
                                                                    case 7002:
                                                                        return VRCORE_COMMON_CONTINUE_VRMODE;
                                                                    default:
                                                                        switch (i) {
                                                                            case 7048:
                                                                                return VRCORE_COMMON_CLIENT_DIED;
                                                                            case 7049:
                                                                                return VRCORE_COMMON_ERROR;
                                                                            case 7050:
                                                                                return VRCORE_CONTROLLER_CONNECTED;
                                                                            case 7051:
                                                                                return VRCORE_CONTROLLER_ERROR;
                                                                            case 7052:
                                                                                return VRCORE_CONTROLLER_OTA_ERROR;
                                                                            case 7053:
                                                                                return VRCORE_CONTROLLER_OTA_STARTED;
                                                                            case 7054:
                                                                                return VRCORE_CONTROLLER_OTA_SUCCESS;
                                                                            case 7055:
                                                                                return VRCORE_CONTROLLER_OTA_SUCCESS_TRIVIAL;
                                                                            case 7056:
                                                                                return VRCORE_CONTROLLER_OTA_DATA_TRANSFER_SUCCESS;
                                                                            case 7057:
                                                                                return VRCORE_CONTROLLER_PAIRING_ERROR;
                                                                            case 7058:
                                                                                return VRCORE_CONTROLLER_PAIRING_STARTED;
                                                                            case 7059:
                                                                                return VRCORE_CONTROLLER_PAIRING_SUCCESS;
                                                                            case 7060:
                                                                                return VRCORE_CONTROLLER_RECALIBRATED;
                                                                            case 7061:
                                                                                return VRCORE_CONTROLLER_RECALIBRATION_ERROR;
                                                                            case 7062:
                                                                                return VRCORE_CONTROLLER_SLEPT_END;
                                                                            case 7063:
                                                                                return VRCORE_CONTROLLER_SLEPT_IDLE;
                                                                            case 7064:
                                                                                return VRCORE_CONTROLLER_VOLUME_ADJUSTED;
                                                                            case 7065:
                                                                                return VRCORE_CONTROLLER_EMULATOR_CONNECTED;
                                                                            case 7066:
                                                                                return VRCORE_CONTROLLER_EMULATOR_ERROR;
                                                                            case 7067:
                                                                                return VRCORE_CONTROLLER_RAIL_REPORT;
                                                                            case 7068:
                                                                                return VRCORE_CONTROLLER_STUCK_NOTIFICATION_SHOWN;
                                                                            case 7069:
                                                                                return VRCORE_CONTROLLER_STUCK_EXITED_VR;
                                                                            case 7070:
                                                                                return VRCORE_CONTROLLER_STUCK_NOTIFICATION_TAPPED;
                                                                            case 7071:
                                                                                return VRCORE_CONTROLLER_OTA_DATA_TRANSFER_STARTED;
                                                                            case 7072:
                                                                                return VRCORE_CONTROLLER_RECOVERY_MODE;
                                                                            case 7073:
                                                                                return VRCORE_CONTROLLER_SLODR_DETECTED;
                                                                            case 7074:
                                                                                return VRCORE_CONTROLLER_HANDEDNESS_SWITCHED;
                                                                            case 7075:
                                                                                return VRCORE_CONTROLLER_DISCONNECTED;
                                                                            case 7100:
                                                                                return VRCORE_NFC_TRIGGER_INTENT;
                                                                            case 7199:
                                                                                return VRCORE_NOTIFICATION_ERROR;
                                                                            case 7200:
                                                                                return VRCORE_SETTINGS_LAUNCHED;
                                                                            case 7201:
                                                                                return VRCORE_SETTINGS_ENABLE_NOTIFICATION;
                                                                            case 7202:
                                                                                return VRCORE_SETTINGS_DISABLE_NOTIFICATION;
                                                                            case 7203:
                                                                                return VRCORE_COMMON_PERMISSION_GRANTED;
                                                                            case 7204:
                                                                                return VRCORE_COMMON_PERMISSION_DENIED;
                                                                            case 7249:
                                                                                return VRCORE_SETTINGS_ERROR;
                                                                            case 7250:
                                                                                return VRCORE_DAYDREAM_DON_STARTED;
                                                                            case 7251:
                                                                                return VRCORE_DAYDREAM_DON_SUCCESS;
                                                                            case 7252:
                                                                                return VRCORE_DAYDREAM_DON_ERROR;
                                                                            case 7253:
                                                                                return VRCORE_DAYDREAM_SESSION_STARTED;
                                                                            case 7254:
                                                                                return VRCORE_DAYDREAM_SESSION_ENDED;
                                                                            case 7255:
                                                                                return VRCORE_DAYDREAM_HOME_LAUNCHED;
                                                                            case 7256:
                                                                                return VRCORE_DAYDREAM_METAWORLD_STARTED;
                                                                            case 7257:
                                                                                return VRCORE_DAYDREAM_METAWORLD_DISMISSED;
                                                                            case 7258:
                                                                                return VRCORE_DAYDREAM_SYSTEM_UPDATE_ACCEPTED;
                                                                            case 7259:
                                                                                return VRCORE_DAYDREAM_SYSTEM_UPDATE_DECLINED;
                                                                            case 7350:
                                                                                return VRCORE_CAPTURE_ERROR;
                                                                            case 7351:
                                                                                return VRCORE_CAPTURE_START_CASTING;
                                                                            case 7352:
                                                                                return VRCORE_CAPTURE_STOP_CASTING;
                                                                            case 7353:
                                                                                return VRCORE_CAPTURE_SAVING_SCREENSHOT;
                                                                            case 7354:
                                                                                return VRCORE_CAPTURE_STARTING_VIDEO_RECORDING;
                                                                            case 7355:
                                                                                return VRCORE_CAPTURE_STOPPING_VIDEO_RECORDING;
                                                                            case 7356:
                                                                                return VRCORE_CAPTURE_STOP_CASTING_ON_DOFF;
                                                                            case 7357:
                                                                                return VRCORE_CAPTURE_REQUESTING_FS_PERMISSION;
                                                                            case 7358:
                                                                                return VRCORE_CAPTURE_FS_PERMISSION_GRANTED;
                                                                            case 7359:
                                                                                return VRCORE_CAPTURE_FS_PERMISSION_DENIED;
                                                                            case 7995:
                                                                                return VRCORE_LOCK_SCREEN_EVENT;
                                                                            case 7996:
                                                                                return VRCORE_HEAD_TRACKING_REPORT;
                                                                            case 7997:
                                                                                return VRCORE_GRAPHICS_REPORT;
                                                                            case 7998:
                                                                                return VRCORE_DASHBOARD_EVENT;
                                                                            case 7999:
                                                                                return VRCORE_PERFORMANCE_REPORT;
                                                                            case 8000:
                                                                                return EARTHVR_APP_STARTED;
                                                                            case 8001:
                                                                                return EARTHVR_APP_STOPPED;
                                                                            case 8002:
                                                                                return EARTHVR_APP_IDLE;
                                                                            case 8003:
                                                                                return EARTHVR_APP_MODE_ENTERED;
                                                                            case 8004:
                                                                                return EARTHVR_APP_MODE_EXITED;
                                                                            case 8005:
                                                                                return EARTHVR_APP_PREFERENCES_CHANGED;
                                                                            case 8006:
                                                                                return EARTHVR_APP_ENVIRONMENT_CHANGED;
                                                                            case 8007:
                                                                                return EARTHVR_APP_INITIALIZED;
                                                                            case 8008:
                                                                                return EARTHVR_APP_SDK_FORCED_SHUTDOWN;
                                                                            case 8009:
                                                                                return EARTHVR_FORCE_HUMAN_SCALE_CHANGED;
                                                                            case 8100:
                                                                                return EARTHVR_NAVIGATION_ARCBALL_STARTED;
                                                                            case 8101:
                                                                                return EARTHVR_NAVIGATION_ARCBALL_UPDATED;
                                                                            case 8102:
                                                                                return EARTHVR_NAVIGATION_ARCBALL_STOPPED;
                                                                            case 8103:
                                                                                return EARTHVR_NAVIGATION_FLYING_STARTED;
                                                                            case 8104:
                                                                                return EARTHVR_NAVIGATION_FLYING_UPDATED;
                                                                            case 8105:
                                                                                return EARTHVR_NAVIGATION_FLYING_STOPPED;
                                                                            case 8106:
                                                                                return EARTHVR_NAVIGATION_SKY_TIME_TRAVELING_STARTED;
                                                                            case 8107:
                                                                                return EARTHVR_NAVIGATION_SKY_TIME_TRAVELING_UPDATED;
                                                                            case 8108:
                                                                                return EARTHVR_NAVIGATION_SKY_TIME_TRAVELING_STOPPED;
                                                                            case 8109:
                                                                                return EARTHVR_NAVIGATION_ROTATING_STARTED;
                                                                            case 8110:
                                                                                return EARTHVR_NAVIGATION_ROTATING_UPDATED;
                                                                            case 8111:
                                                                                return EARTHVR_NAVIGATION_ROTATING_STOPPED;
                                                                            case 8150:
                                                                                return EARTHVR_NAVIGATION_TRANSITION_STARTED;
                                                                            case 8151:
                                                                                return EARTHVR_NAVIGATION_TRANSITION_STOPPED;
                                                                            case 8200:
                                                                                return EARTHVR_RENDERING_TUNNEL_VISION_APPEARED;
                                                                            case 8201:
                                                                                return EARTHVR_RENDERING_TUNNEL_VISION_DISAPPEARED;
                                                                            case 8300:
                                                                                return EARTHVR_MENU_OPENED;
                                                                            case 8301:
                                                                                return EARTHVR_MENU_CLOSED;
                                                                            case 8302:
                                                                                return EARTHVR_MENU_PREFERENCES_OPENED;
                                                                            case 8303:
                                                                                return EARTHVR_MENU_PREFERENCES_CLOSED;
                                                                            case 8304:
                                                                                return EARTHVR_MENU_CATEGORY_SELECTED;
                                                                            case 8305:
                                                                                return EARTHVR_MENU_PAGE_CHANGED;
                                                                            case 8306:
                                                                                return EARTHVR_MENU_CARD_CLICKED;
                                                                            case 8307:
                                                                                return EARTHVR_MENU_PLACE_DELETION_REQUESTED;
                                                                            case 8308:
                                                                                return EARTHVR_DESKTOP_WINDOW_MENU_ITEM_SELECTED;
                                                                            case 8309:
                                                                                return EARTHVR_SEARCH_OPENED;
                                                                            case 8310:
                                                                                return EARTHVR_SEARCH_CLOSED;
                                                                            case 8311:
                                                                                return EARTHVR_SEARCH_ENTITY_SELECTED;
                                                                            case 8312:
                                                                                return EARTHVR_SEARCH_PIN_DISMISSED;
                                                                            case 8313:
                                                                                return EARTHVR_SEARCH_PIN_EXPIRED;
                                                                            case 8314:
                                                                                return EARTHVR_MENU_COPYRIGHT_OPENED;
                                                                            case 8315:
                                                                                return EARTHVR_MENU_COPYRIGHT_CLOSED;
                                                                            case 8400:
                                                                                return EARTHVR_TOUR_PAUSED;
                                                                            case 8401:
                                                                                return EARTHVR_TOUR_RESUMED;
                                                                            case 8402:
                                                                                return EARTHVR_TOUR_COMPLETED;
                                                                            case 8403:
                                                                                return EARTHVR_TUTORIAL_STAGE_CHANGED;
                                                                            case 8404:
                                                                                return EARTHVR_TOUR_STARTED;
                                                                            case 8405:
                                                                                return EARTHVR_SPLASH_SCREEN_EXITED;
                                                                            case 8500:
                                                                                return EARTHVR_PLACE_SAVED;
                                                                            case 8501:
                                                                                return EARTHVR_REVEAL_QUERY_STARTED;
                                                                            case 8502:
                                                                                return EARTHVR_REVEAL_QUERY_RESULT_READY;
                                                                            case 8503:
                                                                                return EARTHVR_MINIGLOBE_BECAME_LARGE;
                                                                            case 8504:
                                                                                return EARTHVR_MINIGLOBE_BECAME_SMALL;
                                                                            case 8505:
                                                                                return EARTHVR_MINIGLOBE_ROTATED;
                                                                            case 8506:
                                                                                return EARTHVR_MINIGLOBE_TELEPORT_TRIGGERED;
                                                                            case 8507:
                                                                                return EARTHVR_ACTION_ORB_EXPANSION_STATE_CHANGED;
                                                                            case 8508:
                                                                                return EARTHVR_ACTION_ORB_DISPLAY_MODE_CHANGED;
                                                                            case 8550:
                                                                                return EARTHVR_STREET_VIEW_STATE_CHANGED;
                                                                            case 8551:
                                                                                return EARTHVR_STREET_VIEW_PANO_PREVIEW_LOADED;
                                                                            case 8552:
                                                                                return EARTHVR_STREET_VIEW_PANO_HI_RES_PREVIEW_LOADED;
                                                                            case 8553:
                                                                                return EARTHVR_STREET_VIEW_PANO_MIRTH_LOADED;
                                                                            case 8554:
                                                                                return EARTHVR_STREET_VIEW_USER_DISCOVERED_NEIGHBOR;
                                                                            case 9000:
                                                                                return KEYBOARD_EVENT;
                                                                            case 10000:
                                                                                return STREET_VIEW_COLLECTION;
                                                                            case 10001:
                                                                                return STREET_VIEW_PANO_IN_COLLECTION;
                                                                            case 10002:
                                                                                return STREET_VIEW_PANO_IN_SEARCH_RESULTS;
                                                                            case 10003:
                                                                                return STREET_VIEW_NO_KEYBOARD;
                                                                            case 10004:
                                                                                return STREET_VIEW_SEARCH_START;
                                                                            case 10005:
                                                                                return STREET_VIEW_SEARCH_RESULTS;
                                                                            case 10006:
                                                                                return STREET_VIEW_SEARCH_NO_RESULTS;
                                                                            case 10007:
                                                                                return STREET_VIEW_SEARCH_DISMISS;
                                                                            case 10008:
                                                                                return STREET_VIEW_SEARCH_EDIT;
                                                                            case 10009:
                                                                                return STREET_VIEW_PANO_NAV_SESSION;
                                                                            case 10010:
                                                                                return STREET_VIEW_APP_BUTTON;
                                                                            case 10011:
                                                                                return STREET_VIEW_SEARCH_NO_PANOS;
                                                                            case 10012:
                                                                                return STREET_VIEW_SEARCH_REQUIRES_GMS_CORE_UPDATE;
                                                                            case 10013:
                                                                                return STREET_VIEW_TUTORIAL_SESSION;
                                                                            case 11000:
                                                                                return PHOTOS_APPLICATION;
                                                                            case 11010:
                                                                                return PHOTOS_GALLERY_NEXT;
                                                                            case 11011:
                                                                                return PHOTOS_GALLERY_PREV;
                                                                            case 11012:
                                                                                return PHOTOS_GALLERY_SCRUB_DRAG;
                                                                            case 11013:
                                                                                return PHOTOS_GALLERY_TAB_CHANGE;
                                                                            case 11020:
                                                                                return PHOTOS_ACCOUNT_CHANGE;
                                                                            case 11021:
                                                                                return PHOTOS_ACCOUNT_INVALID;
                                                                            case 11030:
                                                                                return PHOTOS_OPEN_MEDIA;
                                                                            case 11031:
                                                                                return PHOTOS_CAROUSEL_NEXT;
                                                                            case 11032:
                                                                                return PHOTOS_CAROUSEL_PREV;
                                                                            case 11040:
                                                                                return PHOTOS_CC_CARD_SHOWN;
                                                                            case 11041:
                                                                                return PHOTOS_CC_CARD_DISMISS;
                                                                            case 11042:
                                                                                return PHOTOS_CC_CARD_SUCCESS;
                                                                            case 11050:
                                                                                return PHOTOS_BACKUP_CARD_SHOWN;
                                                                            case 11051:
                                                                                return PHOTOS_BACKUP_CARD_DISMISS;
                                                                            case 11052:
                                                                                return PHOTOS_BACKUP_CARD_SUCCESS;
                                                                            case 11060:
                                                                                return PHOTOS_SIGN_CARD_SHOWN;
                                                                            case 11061:
                                                                                return PHOTOS_WARM_WELCOME_SHOWN;
                                                                            case 12000:
                                                                                return VRHOME_SETUP_STEP_START;
                                                                            case 12001:
                                                                                return VRHOME_SETUP_STEP_END;
                                                                            case 12002:
                                                                                return VRHOME_SETUP_STEP_STATE_CHANGE;
                                                                            case 12003:
                                                                                return VRHOME_GCONFIG_UPDATED;
                                                                            case 12004:
                                                                                return VRHOME_GET_VIEWER_CLICK;
                                                                            case 12005:
                                                                                return VRHOME_DIALOG_ACTION;
                                                                            case 13000:
                                                                                return JUMP_INSPECTOR_APP_STARTED;
                                                                            case 13001:
                                                                                return JUMP_INSPECTOR_PLAYBACK;
                                                                            case 13002:
                                                                                return JUMP_INSPECTOR_PICKER;
                                                                            case 13003:
                                                                                return JUMP_INSPECTOR_OPEN_SETTINGS;
                                                                            case 13004:
                                                                                return JUMP_INSPECTOR_ADD_TO_HOME_SCREEN;
                                                                            case 13005:
                                                                                return JUMP_INSPECTOR_OPEN_FAQ;
                                                                            case 13006:
                                                                                return JUMP_INSPECTOR_ERROR;
                                                                            case 14000:
                                                                                return STREAMING_APP_START;
                                                                            case 14001:
                                                                                return STREAMING_FRAMES;
                                                                            case 15000:
                                                                                return TOUR_STARTED;
                                                                            case 15001:
                                                                                return TOUR_ENDED;
                                                                            case 16000:
                                                                                return TANGO_6DOF_FAILURE;
                                                                            case 16001:
                                                                                return TANGO_6DOF_RECOVERY;
                                                                            case 16002:
                                                                                return TANGO_FLOOR_HEIGHT_CHANGE;
                                                                            case 17000:
                                                                                return STANDALONE_POWER_STATE;
                                                                            case 17001:
                                                                                return STANDALONE_MEMORY_STATS;
                                                                            case 17002:
                                                                                return STANDALONE_HEADSET_ON;
                                                                            case 17003:
                                                                                return STANDALONE_HEADSET_OFF;
                                                                            case 17004:
                                                                                return STANDALONE_IDLE_ENTER;
                                                                            case 17005:
                                                                                return STANDALONE_IDLE_EXIT;
                                                                            case 17006:
                                                                                return STANDALONE_IDLE_SHOW_WARNING;
                                                                            case 17007:
                                                                                return STANDALONE_IDLE_WARNING_DISMISSED;
                                                                            case 18000:
                                                                                return EVA_APPLICATION;
                                                                            case 18001:
                                                                                return EVA_PAIRING;
                                                                            case 18002:
                                                                                return EVA_CAPTURE;
                                                                            case 18003:
                                                                                return EVA_FILE_TRANSFER;
                                                                            case 18004:
                                                                                return EVA_VIEW;
                                                                            case 18005:
                                                                                return EVA_CAMERA_STATUS;
                                                                            case 18006:
                                                                                return EVA_BLUETOOTH_SESSION;
                                                                            case 18007:
                                                                                return EVA_WIFI_SETUP_SESSION;
                                                                            case 18008:
                                                                                return EVA_SHARE;
                                                                            case 18009:
                                                                                return EVA_CAMERA_CRASH;
                                                                            case 18010:
                                                                                return EVA_DELETE;
                                                                            case 18011:
                                                                                return EVA_WIGGLEGRAM_GENERATED;
                                                                            case 18012:
                                                                                return EVA_EXPORT_MEDIA;
                                                                            case 18013:
                                                                                return EVA_CAMERA_FIRMWARE_UPDATE;
                                                                            case 18014:
                                                                                return EVA_SELECTION_ACTION;
                                                                            case 19000:
                                                                                return VR180_CREATOR_START;
                                                                            case 19001:
                                                                                return VR180_CREATOR_VIDEO_CONVERT;
                                                                            case 19002:
                                                                                return VR180_CREATOR_VIDEO_PUBLISH;
                                                                            case 19003:
                                                                                return VR180_CREATOR_PHOTO_SPLIT;
                                                                            case 19004:
                                                                                return VR180_CREATOR_PHOTO_MERGE;
                                                                            case 19005:
                                                                                return VR180_CREATOR_PHOTO_CONVERT;
                                                                            case 19006:
                                                                                return VR180_CREATOR_VIDEO_STITCH;
                                                                            default:
                                                                                switch (i) {
                                                                                    case 7149:
                                                                                        return VRCORE_NFC_ERROR;
                                                                                    case 7150:
                                                                                        return VRCORE_NOTIFICATION_POSTED;
                                                                                    case 7151:
                                                                                        return VRCORE_NOTIFICATION_REMOVED;
                                                                                    default:
                                                                                        return null;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    private andw(int i) {
        this.c = i;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
