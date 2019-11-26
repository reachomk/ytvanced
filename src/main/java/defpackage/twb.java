package defpackage;

/* renamed from: twb */
final class twb implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ bcfe c;
    private final /* synthetic */ bcbb d;
    private final /* synthetic */ String e;
    private final /* synthetic */ twc f;

    twb(twc twc, String str, boolean z, bcfe bcfe, bcbb bcbb, String str2) {
        this.f = twc;
        this.a = str;
        this.b = z;
        this.c = bcfe;
        this.d = bcbb;
        this.e = str2;
    }

    public final void run() {
        this.f.a(this.a, this.b, this.c, this.d, this.e);
    }
}
