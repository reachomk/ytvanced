package defpackage;

import android.view.KeyEvent;
import com.google.android.youtube.R;

/* renamed from: gco */
final class gco implements gcw {
    private final /* synthetic */ gcl a;

    gco(gcl gcl) {
        this.a = gcl;
    }

    public final boolean a() {
        return this.a.Z();
    }

    public final boolean a(int i) {
        nf a = this.a.s().a((int) R.id.reel_container);
        if (!a.v() || !(a instanceof gbt)) {
            return false;
        }
        gbt gbt = (gbt) a;
        if (gbt.al()) {
            return false;
        }
        geo geo = gbt.am;
        if (geo == null) {
            geq geq = gbt.an;
            if (geq == null) {
                if (i != 24 && i != 25) {
                    return false;
                }
                if (gbt.ao) {
                    gbt.ao = false;
                    gbt.f();
                } else if (gbt.ak.a()) {
                    gbt.f();
                } else {
                    gbt.W();
                }
            } else if ((i != 24 && i != 25) || geq.b) {
                return false;
            } else {
                if (geq.c) {
                    geq.c = false;
                    geq.a.ae();
                } else {
                    geq.a.aa();
                    geq.a.ac();
                }
                geq.d = false;
            }
        } else if (i != 24 && i != 25) {
            return false;
        } else {
            if (geo.c && !geo.b) {
                geo.a.ag();
            }
            geo.c = false;
        }
        return true;
    }

    public final boolean a(int i, KeyEvent keyEvent) {
        nf a = this.a.s().a((int) R.id.reel_container);
        boolean z = false;
        if (a.v() && (a instanceof gbt)) {
            gbt gbt = (gbt) a;
            if (!gbt.al()) {
                geo geo = gbt.am;
                if (geo == null) {
                    geq geq = gbt.an;
                    if (geq == null) {
                        if (i == 24 || i == 25) {
                            keyEvent.startTracking();
                            return true;
                        }
                    } else if (i == 24 || i == 25) {
                        keyEvent.startTracking();
                        if (!geq.d) {
                            geq.a.ab();
                        }
                        geq.d = true;
                    }
                } else if (i == 24 || i == 25) {
                    keyEvent.startTracking();
                    if (!(geo.c || geo.b)) {
                        geo.c = true;
                        geo.a.af();
                        return true;
                    }
                }
                z = true;
            }
        }
        return z;
    }

    public final boolean b(int i) {
        nf a = this.a.s().a((int) R.id.reel_container);
        if (!a.v() || !(a instanceof gbt)) {
            return false;
        }
        gbt gbt = (gbt) a;
        if (gbt.al()) {
            return false;
        }
        geo geo = gbt.am;
        if (geo == null) {
            geq geq = gbt.an;
            if (geq == null) {
                if (i != 24 && i != 25) {
                    return false;
                }
                gbt.W();
                gbt.ao = true;
            } else if ((i != 24 && i != 25) || geq.b) {
                return false;
            } else {
                geq.a.ad();
                geq.c = true;
            }
            return true;
        } else if ((i != 24 && i != 25) || geo.b) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean b() {
        gcl gcl = this.a;
        boolean z = false;
        if (gcl.F_()) {
            nf a = gcl.s().a((int) R.id.reel_container);
            if (!(a instanceof gdn)) {
                if (a instanceof gbt) {
                    gbt gbt = (gbt) a;
                    if (!gbt.al()) {
                        if (!gbt.ai) {
                            return false;
                        }
                    }
                }
                z = true;
            }
        }
        return z;
    }

    public final void a(float f) {
        gbt gbt = this.a.ag;
        if (gbt != null) {
            gbt.ah = f;
        }
    }
}
