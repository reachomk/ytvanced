package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: sal */
public final class sal {
    public final List a;
    public final List b;
    public final int c;
    public int d;
    public final String e;
    public final Class f;
    public final Class g;
    public List h;
    public final pjr i;
    public final boolean j;
    public final int k;
    public final bae l;
    public final boolean m;

    public /* synthetic */ sal(sak sak) {
        if (sak.c) {
            this.d |= 8;
        }
        if (sak.d) {
            this.d |= 32;
        }
        this.a = new ArrayList(sak.a);
        this.b = new ArrayList(sak.b);
        this.c = sak.e;
        this.e = sak.f;
        this.f = null;
        if (!sak.g.isEmpty()) {
            this.h = new ArrayList(sak.g);
        }
        pjr pjr = new pjq().a;
        pjr.a = false;
        this.i = pjr;
        this.j = sak.h;
        this.k = sak.i;
        this.g = null;
        this.l = null;
        this.m = sak.j;
    }
}
