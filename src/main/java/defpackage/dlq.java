package defpackage;

import com.google.android.libraries.youtube.upload.service.UploadService;

/* renamed from: dlq */
final class dlq implements amda {
    private volatile Object a = new baqe();
    private final /* synthetic */ diu b;

    /* synthetic */ dlq(diu diu) {
        this.b = diu;
    }

    public final void a(UploadService uploadService) {
        uploadService.b = this.b.oA();
        uploadService.c = this.b.hE();
        uploadService.d = this.b.iS();
        uploadService.e = this.b.iN();
        uploadService.f = this.b.iP();
        this.b.iO();
        Object obj = this.a;
        if (obj instanceof baqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof baqe) {
                    obj2 = new amcu(this.b.ow(), this.b.iQ());
                    this.a = bapx.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        uploadService.g = (amcu) obj;
    }
}
