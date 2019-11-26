package defpackage;

/* renamed from: aebh */
public enum aebh {
    PRODUCTION("https://www.youtube.com/api/lounge", ""),
    STAGING("https://www.youtube.com/api/loungestaging", "&env_mdxEnvironment=STAGING"),
    SANDBOX("https://www.youtube.com/api/loungesandbox", "&env_mdxEnvironment=SANDBOX"),
    DEV("https://www.youtube.com/api/loungedev", "&env_mdxEnvironment=DEV");
    
    public static final aebh e = null;
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public static aebh a(String str) {
        return (aebh) Enum.valueOf(aebh.class, str);
    }

    private aebh(String str, String str2) {
        this.a = String.valueOf(str).concat("/bc/bind");
        this.b = String.valueOf(str).concat("/pairing/");
        this.c = String.valueOf(str).concat("/screens/em");
        this.d = str2;
    }

    static {
        e = r5;
    }
}
