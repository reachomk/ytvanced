package defpackage;

import android.graphics.Bitmap;

/* renamed from: ndp */
final class ndp extends mzo {
    public final /* synthetic */ ndi a;

    ndp(ndi ndi) {
        this.a = ndi;
    }

    public final void a(Bitmap bitmap) {
        bdfg bdfg = this.a.j;
        bdfg.e_(((ngf) bdfg.i()).d().a(bitmap).a());
    }

    public final void a(boolean z) {
        this.a.b.post(new nds(this, z));
    }

    public final void a(CharSequence charSequence) {
        bdfg bdfg = this.a.j;
        bdfg.e_(((ngf) bdfg.i()).d().a(charSequence).a());
    }

    public final void b(CharSequence charSequence) {
        bdfg bdfg = this.a.j;
        bdfg.e_(((ngf) bdfg.i()).d().b(charSequence).a());
    }

    public final void a(int i) {
        this.a.b.post(new ndr(this, i));
    }

    public final void b(boolean z) {
        this.a.b.post(new ndu(this, z));
    }

    public final String a(String str) {
        return this.a.a(str);
    }
}
