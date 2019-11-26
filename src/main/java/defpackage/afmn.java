package defpackage;

/* renamed from: afmn */
public enum afmn {
    ANDROID("android"),
    ANDROID_TV("android_tv"),
    ANDROID_TV_KIDS("android_tv_kids"),
    TVANDROID("tvandroid"),
    TV_UNPLUGGED_ANDROID("tv_unplugged_android"),
    ANDROID_CREATOR("android_creator"),
    ANDROID_EMBEDDED_PLAYER("android_embedded_player"),
    ANDROID_GAMING("android_gaming"),
    ANDROID_KIDS("android_kids"),
    ANDROID_MUSIC("android_music"),
    ANDROID_VR("android_vr"),
    ANDROID_UNPLUGGED("android_unplugged"),
    ANDROID_LITE("android_lite"),
    ANDROID_TESTSUITE("android_testsuite"),
    OTHERAPP("otherapp"),
    UNKNOWN("unknown_interface");
    
    public final String d;

    private afmn(String str) {
        this.d = str;
    }
}
