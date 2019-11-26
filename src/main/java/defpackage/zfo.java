package defpackage;

import android.widget.ListAdapter;

/* renamed from: zfo */
final class zfo implements zel {
    private final /* synthetic */ nn a;
    private final /* synthetic */ zfm b;

    zfo(zfm zfm, nn nnVar) {
        this.b = zfm;
        this.a = nnVar;
    }

    public final void a(zep zep) {
        zfi n = ((zfk) this.a).n();
        this.b.ad.a(zep.a);
        zfm zfm = this.b;
        nn nnVar = this.a;
        zfm.ab = new zgb(nnVar, zep.a(nnVar), n, this.b.a, false);
        zfm = this.b;
        zfm.aa.setAdapter((ListAdapter) amqw.a(zfm.ab));
        this.b.b.setVisibility(8);
        this.b.aa.setBackgroundColor(zep.b);
        this.b.aa.setVisibility(0);
    }

    public final void a() {
        zfm zfm = this.b;
        zfm.b.setVisibility(0);
        zfm.c.setVisibility(8);
        zfm.Z.setVisibility(0);
        zfm.aa.setVisibility(8);
    }
}
