package defpackage;

import android.graphics.Bitmap;

/* renamed from: nfv */
final class nfv extends ngi {
    public CharSequence a;
    public CharSequence b;
    public Bitmap c;

    nfv() {
    }

    public final ngi a(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public final ngi b(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public final ngi a(Bitmap bitmap) {
        this.c = bitmap;
        return this;
    }

    public final ngf a() {
        return new nfw(this.a, this.b, this.c);
    }

    /* synthetic */ nfv(ngf ngf) {
        nfw nfw = (nfw) ngf;
        this.a = nfw.a;
        this.b = nfw.b;
        this.c = nfw.c;
    }
}
