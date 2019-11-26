package defpackage;

/* renamed from: voi */
public enum voi {
    PYV_AD("Discovery ad", "adsenseSkippable"),
    PYV_APP_INSTALL("Discovery App Install ad", "pyvAppInstallVastAd"),
    IMAGE_AD_SHORT("320 x 50 Image Ad", "admob/image_320_50"),
    IMAGE_AD_TALL("300 x 250 Image Ad", "admob/image_300_250"),
    TEXT_LANDSCAPE_IMAGE_AD("Text Ad with Landscape Image", "nativeTextAdLandscape"),
    TEXT_SQUARE_IMAGE_AD("Text Ad with Square Image", "nativeTextAdSquare"),
    TEXT_CTD_AD("Text CTD Ad", "admob/native_ctd_android"),
    TEXT_CTD_LANDSCAPE_IMAGE_AD("Text CTD Ad with Landscape Image", "admob/native_ctd_landscape_android"),
    TEXT_CTD_SQUARE_IMAGE_AD("Text CTD Ad with Square Image", "admob/native_ctd_square_android"),
    IMAGE_CTD_AD("Image CTD Ad", "admob/image_ctd_320_50_android"),
    TEXT_GPA_AD("Text GPA/Product Ad", "gpa/native_gpa"),
    TEXT_CAROUSEL_AD("Text Carousel Ad with Landscape Images", "carouselAd"),
    GROUP_ID("Group ID", null),
    q(r12, null),
    NONE("None Selected", null),
    KEYWORD("Masthead Keywords", null);
    
    public final String b;
    public final String c;

    public static voi a(String str) {
        return (voi) Enum.valueOf(voi.class, str);
    }

    private voi(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final String toString() {
        return this.b;
    }

    public static int a(voi voi, boolean z) {
        voi[] a;
        if (z) {
            a = voi.a();
        } else {
            a = voi.c();
        }
        for (int i = 0; i < a.length; i++) {
            if (voi == a[i]) {
                return i;
            }
        }
        return -1;
    }

    public static voi[] a() {
        return new voi[]{NONE, KEYWORD, GROUP_ID, q, PYV_AD, PYV_APP_INSTALL, IMAGE_AD_SHORT, IMAGE_AD_TALL, IMAGE_CTD_AD, TEXT_LANDSCAPE_IMAGE_AD, TEXT_SQUARE_IMAGE_AD, TEXT_CTD_AD, TEXT_CTD_LANDSCAPE_IMAGE_AD, TEXT_CTD_SQUARE_IMAGE_AD, TEXT_GPA_AD, TEXT_CAROUSEL_AD};
    }

    public static voi[] b() {
        return new voi[]{NONE, KEYWORD, GROUP_ID, q, PYV_AD, PYV_APP_INSTALL, IMAGE_AD_SHORT, IMAGE_AD_TALL, IMAGE_CTD_AD, TEXT_LANDSCAPE_IMAGE_AD, TEXT_SQUARE_IMAGE_AD, TEXT_CTD_AD, TEXT_CTD_LANDSCAPE_IMAGE_AD, TEXT_CTD_SQUARE_IMAGE_AD, TEXT_GPA_AD, TEXT_CAROUSEL_AD};
    }

    public static voi[] c() {
        return new voi[]{NONE, KEYWORD, GROUP_ID, q, PYV_AD, PYV_APP_INSTALL, IMAGE_AD_SHORT, IMAGE_AD_TALL, TEXT_LANDSCAPE_IMAGE_AD, TEXT_SQUARE_IMAGE_AD, TEXT_CTD_AD, TEXT_CTD_LANDSCAPE_IMAGE_AD, TEXT_CTD_SQUARE_IMAGE_AD, IMAGE_CTD_AD, TEXT_GPA_AD, TEXT_CAROUSEL_AD};
    }
}
