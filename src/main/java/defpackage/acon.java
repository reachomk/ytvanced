package defpackage;

import com.google.android.libraries.youtube.livecreation.ui.view.StreamStatusView;

/* renamed from: acon */
final class acon implements accz {
    public final /* synthetic */ acnc a;

    acon(acnc acnc) {
        this.a = acnc;
    }

    public final void a(aanq aanq) {
        xtl.a("Could not fetch stream health info", (Throwable) aanq);
        this.a.f(19);
    }

    public final void a() {
        acek acek = this.a.aa;
        int i = acek.a;
        if (i == 6) {
            acek.f(6);
        } else if (i != 5) {
            xtl.d("LiveSC: ignoring notifyStreamBroadcastStatusIsReady");
            acek.f();
        } else {
            acek.f(5);
        }
    }

    public final void b() {
        this.a.aa.b();
        this.a.am();
    }

    public final void c() {
        if (this.a.bb) {
            xtl.c("The stream failed to transition to an active state after an initial period.");
            this.a.ai.post(new acoq(this));
        }
    }

    public final void a(int i, String str, arml arml) {
        acnc acnc = this.a;
        if (acnc.bb && i == 4) {
            acnc.aR = str;
            acnc.aS = arml;
            acnc.aa.c(31);
        }
    }

    public final void a(String str, String str2, int i) {
        acnc acnc = this.a;
        if (acnc.bb) {
            acnc.aK = str;
            StreamStatusView streamStatusView = acnc.av;
            if (streamStatusView != null) {
                streamStatusView.a(str);
            }
            acnc acnc2 = this.a;
            acnc2.aL = str2;
            StreamStatusView streamStatusView2 = acnc2.av;
            if (streamStatusView2 != null) {
                streamStatusView2.b(str2);
            }
            acnc2 = this.a;
            acnc2.aN = i;
            acnc2.a(acnc2.aK, acnc2.aL, i);
        }
    }

    public final void a(String str) {
        acnc acnc = this.a;
        if (acnc.bb) {
            acnc.aM = str;
            StreamStatusView streamStatusView = acnc.av;
            if (streamStatusView != null) {
                streamStatusView.c(str);
            }
        }
    }

    public final void a(int i, String str) {
        if (this.a.bb) {
            String valueOf;
            String str2;
            if (i == 24) {
                valueOf = String.valueOf(str);
                str2 = "WARNING: Stream has a CID match, message=";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    str2.concat(valueOf);
                }
                this.a.aA.a(str);
                acnc.a(this.a.aA);
            } else if (i == 25) {
                valueOf = String.valueOf(str);
                str2 = "ERROR: Stream has a CID match, message=";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    str2.concat(valueOf);
                }
                this.a.aA.a(str);
                acnc.a(this.a.aA);
            } else {
                valueOf = String.valueOf(str);
                str = "Stream CID status is OK, message=";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    str.concat(valueOf);
                }
                this.a.aA.d();
            }
        }
    }

    public final void a(int i, arml arml) {
        if (this.a.bb) {
            if (i == 35) {
                String.valueOf(arml).length();
                this.a.a(aabb.a(arml, this.a.c, false));
                this.a.aS = arml;
            } else if (i == 36) {
                String.valueOf(arml).length();
                this.a.a(aabb.a(arml, this.a.c, false));
                this.a.aS = arml;
            } else {
                String.valueOf(arml).length();
                this.a.aA.d();
            }
        }
    }
}
