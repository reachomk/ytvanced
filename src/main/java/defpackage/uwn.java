package defpackage;

import com.google.protos.youtube.api.innertube.EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint;
import com.google.protos.youtube.api.innertube.GetPhotoEndpointOuterClass$GetPhotoEndpoint;
import com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
import java.util.HashSet;
import java.util.Set;

/* renamed from: uwn */
public final class uwn implements uwx {
    private static final uwo g = new uwp();
    public final nn a;
    public final uwo b;
    public nf c;
    public boolean d = true;
    public boolean e;
    public boolean f;
    private final xci h;
    private final aaas i;
    private final Set j = new HashSet();

    public uwn(nn nnVar, xci xci, aaas aaas) {
        Object obj = g;
        this.a = (nn) amqw.a((Object) nnVar);
        this.h = (xci) amqw.a((Object) xci);
        this.i = (aaas) amqw.a((Object) aaas);
        this.b = (uwo) amqw.a(obj);
    }

    public final void a(apxu apxu) {
        amqw.a((Object) apxu);
        anxr access$000 = anxl.checkIsLite(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.uploadPhotoEndpoint);
        apxu.a(access$000);
        Object b;
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.uploadPhotoEndpoint);
            apxu.a(access$000);
            b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            UploadPhotoEndpointOuterClass$UploadPhotoEndpoint uploadPhotoEndpointOuterClass$UploadPhotoEndpoint = (UploadPhotoEndpointOuterClass$UploadPhotoEndpoint) b;
            uwy uwy = (uwy) a();
            if (uwy != null) {
                uwy.a(uploadPhotoEndpointOuterClass$UploadPhotoEndpoint);
            }
        } else {
            access$000 = anxl.checkIsLite(EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.editChannelBannerEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.editChannelBannerEndpoint);
                apxu.a(access$000);
                b = apxu.h.b(access$000.d);
                if (b != null) {
                    access$000.a(b);
                }
                uwy uwy2 = (uwy) a();
                if (uwy2 != null) {
                    aaqn aaqn = uwy2.aa;
                    aaqq aaqq = new aaqq(aaqn.c, aaqn.d);
                    aaqq.a = uwy2.ag;
                    aaqn = uwy2.aa;
                    uxc uxc = new uxc(uwy2);
                    if (aaqn.i == null) {
                        aaqn.i = new aaqt(aaqn.b, aaqn.e);
                    }
                    aaqn.i.b(aaqq, uxc);
                    return;
                }
            }
            access$000 = anxl.checkIsLite(GetPhotoEndpointOuterClass$GetPhotoEndpoint.getPhotoEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                if (!this.d) {
                    or a = this.a.f().a();
                    if (a() != null) {
                        a.a(this.c);
                        this.f = false;
                    }
                    a(1);
                    uwo uwo = this.b;
                    anxr access$0002 = anxl.checkIsLite(GetPhotoEndpointOuterClass$GetPhotoEndpoint.getPhotoEndpoint);
                    apxu.a(access$0002);
                    b = apxu.h.b(access$0002.d);
                    if (b == null) {
                        b = access$0002.b;
                    } else {
                        b = access$0002.a(b);
                    }
                    this.c = uwo.a((GetPhotoEndpointOuterClass$GetPhotoEndpoint) b);
                    a.a(this.c, "update_photo_fragment").c();
                }
                return;
            }
            a(new uwz("Unknown command."));
        }
    }

    public final nf a() {
        nf nfVar = this.c;
        if (nfVar == null) {
            this.c = this.a.f().a("update_photo_fragment");
            nfVar = this.c;
            if (nfVar == null) {
                this.f = false;
            }
        }
        return nfVar;
    }

    public final void b() {
        this.d = false;
    }

    public final void c() {
        if (!this.d && a() != null) {
            if (this.e) {
                this.f = true;
                return;
            }
            this.a.f().a().a(this.c).c();
            this.c = null;
        }
    }

    public final aaas d() {
        return this.i;
    }

    public final void e() {
        c();
        this.h.d(new uru());
        a(2);
    }

    public final void a(Throwable th) {
        xtl.a("Failed photo upload.", th);
        c();
        a(3);
    }

    public final void f() {
        c();
        a(4);
    }

    public final void a(uww uww) {
        this.j.add(uww);
    }

    public final void b(uww uww) {
        this.j.remove(uww);
    }

    public final int g() {
        return (a() == null || ((uwy) a()).ah) ? 0 : 1;
    }

    private final void a(int i) {
        for (uww d : this.j) {
            d.d(i);
        }
    }
}
