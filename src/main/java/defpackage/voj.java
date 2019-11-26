package defpackage;

/* renamed from: voj */
public enum voj {
    UNKNOWN(null, null, null, null, null),
    BROWSE("forceBrowseAdEnable", "forceBrowseAdType", "forceBrowseAdUrl", "forceBrowseAdGroupId", "forceBrowseAdKeyword"),
    SEARCH("forceSearchAdEnable", "forceSearchAdType", "forceSearchAdUrl", "forceSearchAdGroupId", null),
    WATCH_NEXT("forceWatchNextAdEnable", "forceWatchNextAdType", "forceWatchNextAdUrl", "forceWatchNextAdGroupId", null);
    
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    private voj(String str, String str2, String str3, String str4, String str5) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }
}
