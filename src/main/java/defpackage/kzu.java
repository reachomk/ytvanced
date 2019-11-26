package defpackage;

import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;

/* renamed from: kzu */
final /* synthetic */ class kzu implements bbny {
    public static final bbny a = new kzu();

    private kzu() {
    }

    public final boolean a(Object obj) {
        anxp anxp = ((auvl) obj).d;
        if (anxp == null) {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint);
        anxp.a(access$000);
        return anxp.h.a(access$000.d);
    }
}
