package defpackage;

import com.google.protos.youtube.api.innertube.UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint;

/* renamed from: wro */
final class wro implements wmk {
    private final apxu a;
    private final /* synthetic */ wrp b;

    public wro(wrp wrp, apxu apxu) {
        this.b = wrp;
        this.a = apxu;
    }

    public final boolean e() {
        return true;
    }

    public final void c() {
        apxu apxu = this.a;
        anxr access$000 = anxl.checkIsLite(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint = (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint) b;
        int i = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.a;
        Object obj = null;
        if ((i & 16) != 0) {
            aaas aaas = this.b.b;
            apxu = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
            return;
        }
        if ((i & 4) != 0) {
            anze anze;
            aynt aynt = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.c;
            if (aynt == null) {
                aynt = aynt.c;
            }
            if (aynt.a == 86135402) {
                anze = (atuf) aynt.b;
            } else {
                anze = atuf.j;
            }
            obj = (ajwn) ajzv.a(anze, ajwn.class);
        }
        if (obj != null) {
            this.b.a.a(obj);
        }
    }

    public final void d() {
        apxu apxu = this.a;
        anxr access$000 = anxl.checkIsLite(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint = (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint) b;
        if ((unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.a & 32) != 0) {
            aaas aaas = this.b.b;
            apxu = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
    }
}
