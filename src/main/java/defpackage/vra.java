package defpackage;

@Deprecated
/* renamed from: vra */
public enum vra {
    VIDEO_ENDED("1"),
    VIDEO_ERROR(r2),
    AD_VIDEO_TIMEOUT(r2),
    USER_SKIPPED("3"),
    USER_MUTED("4"),
    SURVEY_ENDED("5"),
    ENDCAP_ENDED("6"),
    AD_CHOICE_INTRO_ENDED("7"),
    AUTO_SKIPPED_ON_ENTER("8"),
    NO_AD("9");
    
    public final String j;

    private vra(String str) {
        this.j = str;
    }
}
