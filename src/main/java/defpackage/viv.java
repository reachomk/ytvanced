package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: viv */
public final class viv implements viw {
    private final Map a = new ConcurrentHashMap();

    public final vqy a(vka vka) {
        vka.d.a(vjy.NOT_REQUESTED);
        try {
            vka.d.a(vjy.REQUESTED);
            return vka.c();
        } catch (vkb unused) {
            return null;
        }
    }

    public final void a(String str, vka vka) {
        if (!this.a.containsKey(str)) {
            this.a.put(xvd.a(str), new viu(vka));
        }
    }

    public final void a(String str, vqy vqy) {
        vka g = g(str);
        if (g == null) {
            viv.j("registerAdBreak()");
            return;
        }
        viu viu = (viu) this.a.get(str);
        if (viu == null) {
            viv.j("populateInstreamAdBreak()");
        } else {
            viu.a.a((Object) str, (Object) vqy);
        }
        g.a(vqy);
    }

    public final void a() {
        this.a.clear();
    }

    public final void a(String str) {
        vka g = g(str);
        if (g == null) {
            viv.j("onBreakEndedReasonCanceled()");
        } else {
            g.d.b(vjy.COMPLETE);
        }
    }

    public final vkd b(String str) {
        vka g = g(str);
        if (g == null) {
            viv.j("onBreakEndedRequestDai()");
            return null;
        } else if (g.a()) {
            return g.b();
        } else {
            return null;
        }
    }

    public final void a(String str, vso vso) {
        vka g = g(str);
        if (g == null) {
            viv.j("onAdEndedRequest()");
            return;
        }
        if (vso instanceof vta) {
            try {
                g.d.a(vjy.THROTTLED);
            } catch (vkb unused) {
            }
        }
    }

    public final boolean a(String str, boolean z) {
        vka g = g(str);
        if (g == null) {
            viv.j("onBreakEndedRequestVod2()");
            return false;
        } else if (z && g.d.a() == vjy.COMPLETE) {
            return false;
        } else {
            if (g.d.a() != vjy.THROTTLED) {
                g.d.b(vjy.COMPLETE);
            }
            h("");
            return true;
        }
    }

    public final boolean c(String str) {
        vka g = g(str);
        if (g == null) {
            viv.j("onBreakEndedRequestVod()");
            return true;
        }
        if (g.b != vsm.PRE_ROLL) {
            int ordinal = ((vjy) g.d.a()).ordinal();
            if (ordinal == 0 || ordinal != 3) {
                return true;
            }
            try {
                g.d.a(vjy.NOT_REQUESTED);
                return false;
            } catch (vkb unused) {
            }
        }
        return true;
    }

    public final vqy d(String str) {
        viu viu = (viu) this.a.get(str);
        String str2 = "getBreakForScheduleAdsRequest()";
        if (viu == null) {
            viv.j(str2);
            return null;
        }
        vka vka = viu.b;
        if (vka == null) {
            viv.j(str2);
            return null;
        }
        if (vka.d.a() != vjy.THROTTLED) {
            vka.d.a(vjy.REQUESTED);
            try {
                vka.d.a(vjy.ACQUIRED);
                if (!viu.a.isDone()) {
                    viu.a.get(5000, TimeUnit.MILLISECONDS);
                }
                return vka.c();
            } catch (ExecutionException | TimeoutException | vkb unused) {
            }
        }
        return null;
    }

    public final int e(String str) {
        vka g = g(str);
        if (g == null) {
            viv.j("onBreakEntered()");
            return 0;
        }
        g.a();
        return 2;
    }

    public final vqy f(String str) {
        vka g = g(str);
        if (g != null) {
            return g.c();
        }
        viv.j("getAdBreak()");
        return null;
    }

    public final vka g(String str) {
        viu viu = (viu) this.a.get(str);
        if (viu != null) {
            return viu.b;
        }
        viv.j("getAdBreakState()");
        return null;
    }

    public final void h(String str) {
        viu viu = (viu) this.a.get(str);
        if (!str.equals("") && viu == null) {
            viv.j("setActiveAdBreakState()");
        }
    }

    public final vsm i(String str) {
        viu viu = (viu) this.a.get(str);
        if (viu != null) {
            return viu.b.b;
        }
        viv.j("getBreakType()");
        return vsm.PRE_ROLL;
    }

    private static void j(String str) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 36);
        stringBuilder.append("BreakRepository retrieve in ");
        stringBuilder.append(str);
        stringBuilder.append(" failed.");
        str = stringBuilder.toString();
        afpc.a(2, afpf.ad, str, new Exception());
        xtl.c(str);
    }
}
