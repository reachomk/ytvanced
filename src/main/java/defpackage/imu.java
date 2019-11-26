package defpackage;

/* renamed from: imu */
public final /* synthetic */ class imu {
    public static imr a(Object obj) {
        if (obj instanceof apgu) {
            return new imt((apgu) obj);
        }
        if (obj instanceof avmq) {
            return new imw((avmq) obj);
        }
        throw new IllegalArgumentException("BundleItemModel can only wrap BundleItemRenderer or OfflineBundleItemRenderer");
    }
}
