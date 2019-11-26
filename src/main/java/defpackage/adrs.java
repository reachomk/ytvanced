package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: adrs */
final class adrs implements adxy {
    public final /* synthetic */ adro a;

    public final void a(adym adym) {
        adro adro;
        String str = "adSystem";
        String str2 = "clickThroughUrl";
        String str3 = "isSkippable";
        String str4 = "adVideoUrl";
        String str5 = "adVideoId";
        if (!this.a.M()) {
            adiv a = adym.a();
            JSONObject b = adym.b();
            String str6 = adro.e;
            String valueOf = String.valueOf(a);
            String jSONObject = b.toString();
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 11) + String.valueOf(jSONObject).length());
            stringBuilder.append("Received ");
            stringBuilder.append(valueOf);
            stringBuilder.append(": ");
            stringBuilder.append(jSONObject);
            xtl.c(str6, stringBuilder.toString());
            int ordinal = a.ordinal();
            int i = 0;
            adro adro2;
            if (ordinal == 2) {
                try {
                    aagt aagt = new aagt();
                    if (b.has(str5)) {
                        aagt.j = b.getString(str5);
                        arlx arlx = (arlx) arlv.E.createBuilder();
                        valueOf = "https://www.youtube.com/watch?v=";
                        str5 = String.valueOf(b.getString(str5));
                        arlx.a(str5.length() == 0 ? new String(valueOf) : valueOf.concat(str5));
                        aagt.a((arlv) ((anxl) arlx.build()), this.a.t);
                    } else {
                        arlx arlx2 = (arlx) arlv.E.createBuilder();
                        arlx2.a(b.has(str4) ? b.getString(str4) : "https://");
                        aagt.a((arlv) ((anxl) arlx2.build()), this.a.t);
                    }
                    aagt.c = b.getString("contentVideoId");
                    if (b.has(str3)) {
                        if (b.getBoolean(str3)) {
                            aagt.a(adro.g);
                        }
                    }
                    aagt.o = b.getInt("duration");
                    if (b.has(str2)) {
                        aagt.u = Uri.parse(b.getString(str2));
                    }
                    if (b.has(str)) {
                        aagc aagc;
                        str = b.getString(str);
                        aagc[] values = aagc.values();
                        int length = values.length;
                        while (i < length) {
                            aagc = values[i];
                            if (aagc.b.equals(str)) {
                                break;
                            }
                            i++;
                        }
                        aagc = aagc.UNKNOWN;
                        aagt.m = aagc;
                    }
                    aagt.S = this.a.m.a() + adro.h;
                    aagt.i = this.a.l.a();
                    aagr aagr = (aagr) aagt.b();
                    adro2 = this.a;
                    adro2.E = aagr;
                    adro2.J = wxf.a();
                    adro2 = this.a;
                    waf waf = adro2.o;
                    wxf wxf = adro2.J;
                    if (waf.c != null) {
                        waf.c.cancel(true);
                    }
                    waf.b.execute(new wai(waf, aagr, wxf));
                } catch (JSONException e) {
                    xtl.a(adro.e, "Error receiving adPlaying message", e);
                    adro = this.a;
                    adro.E = null;
                    adro.J = null;
                }
                e(b);
                f(b);
                g(b);
            } else if (ordinal == 3) {
                e(b);
                f(b);
                g(b);
            } else if (ordinal == 8) {
                Pair a2 = aebf.a(b);
                adro2 = this.a;
                Iterator it = ((Set) a2.second).iterator();
                while (it.hasNext()) {
                    if (((adjd) it.next()).b().equals(adro2.f.get())) {
                        it.remove();
                        break;
                    }
                }
                this.a.A = (Set) a2.second;
                adro2 = this.a;
                adsu adsu = adro2.y;
                if (adsu instanceof aduf) {
                    ((aduf) adsu).c(adro2.G());
                }
                if (((adjd) a2.first) != null) {
                    this.a.s.a("c_csfs");
                    this.a.c(1);
                }
                if (!TextUtils.isEmpty(this.a.V)) {
                    adro = this.a;
                    str2 = adro.V;
                    adja adja = new adja();
                    adja.a("serverEvent", str2);
                    adro.a(adiv.SET_IMPACTED_SESSIONS_SERVER_EVENT, adja);
                }
            } else if (ordinal == 17) {
                this.a.K = adrs.c(b);
                this.a.L = b.optString("firstVideoId", adpw.k.a());
                this.a.a(adrs.b(b), false);
            } else if (ordinal == 20) {
                this.a.b(7);
            } else if (ordinal == 27) {
                int optInt = b.optInt("volume", -1);
                if (optInt >= 0) {
                    adro2 = this.a;
                    adro2.Y = optInt;
                    adro2.k.d(new adqr(optInt));
                }
            } else if (ordinal == 30) {
                d(b);
                this.a.X = b.optString("cpn", "");
                this.a.k.d(new adcn());
            } else if (ordinal == 36) {
                this.a.M = adih.a(b.getString("autoplayMode"));
            } else if (ordinal == 41) {
                adro = this.a;
                if (adro.P) {
                    adro.N = Boolean.parseBoolean(b.getString("loopEnabled"));
                    this.a.O = Boolean.parseBoolean(b.getString("shuffleEnabled"));
                }
            } else if (ordinal == 43) {
                adro2 = this.a;
                if (!adro2.M()) {
                    Message obtain = Message.obtain(adro2.B, 5);
                    adro2.B.removeMessages(3);
                    adro2.B.sendMessage(obtain);
                }
            } else if (ordinal == 49) {
                adro = this.a;
                adro.k.d(new adqa(adro.x.br_(), b.optString("authCode"), b.optString("signInSessionId")));
            } else if (ordinal != 38) {
                if (ordinal == 39) {
                    this.a.aa = null;
                    str = b.optString("audioTrackId");
                    for (aahn aahn : this.a.Z) {
                        if (aahn.a.equals(str)) {
                            this.a.aa = aahn;
                            break;
                        }
                    }
                }
                switch (ordinal) {
                    case 12:
                    case 13:
                        this.a.a(adrs.b(b), true);
                        d(b);
                        break;
                    case 14:
                        String optString = b.optString("videoId", this.a.D.a());
                        if (!TextUtils.isEmpty(optString)) {
                            ajis ajis;
                            str = "vss_id";
                            if (b.has(str)) {
                                String optString2 = b.optString("languageCode");
                                str3 = "languageName";
                                String optString3 = b.optString(str3);
                                str4 = "trackName";
                                String optString4 = b.optString(str4);
                                int a3 = xvd.a(b.optString("format"), 1);
                                String optString5 = b.optString(str);
                                str = b.optString(str3);
                                str3 = b.optString(str4);
                                StringBuilder stringBuilder2 = new StringBuilder();
                                stringBuilder2.append(str);
                                if (!(str3 == null || str3.isEmpty() || str3.equalsIgnoreCase(str))) {
                                    stringBuilder2.append(" - ");
                                    stringBuilder2.append(str3);
                                }
                                ajis ajis2 = new ajis(optString2, optString3, optString4, optString, a3, "", "", optString5, "", stringBuilder2.toString());
                            } else {
                                ajis = null;
                            }
                            if (!amqq.a(this.a.D.d(), ajis)) {
                                adro = this.a;
                                adro.D = adro.D.k().a(ajis).e();
                            }
                        }
                        adro = this.a;
                        adro.k.d(new adqj(adro.D.d()));
                        break;
                }
            } else {
                Collection arrayList = new ArrayList();
                JSONArray jSONArray = new JSONArray(b.getString("audioTracks"));
                while (i < jSONArray.length()) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    arrayList.add(new aahn(jSONObject2.getString("id"), jSONObject2.getString("displayName"), jSONObject2.getBoolean("isDefault")));
                    i++;
                }
                this.a.Z = amul.a(arrayList);
            }
            new Handler(Looper.getMainLooper()).post(new adrr(this, a, b));
        }
    }

    private static adpw b(JSONObject jSONObject) {
        String str = "params";
        String str2 = null;
        adpv c = adpw.n().b(adrs.c(jSONObject)).a(adrs.a(jSONObject)).a(adpw.a(jSONObject.optInt("currentIndex", adpw.k.f()))).c(jSONObject.has(str) ? jSONObject.getString(str) : null);
        str = "playerParams";
        if (jSONObject.has(str)) {
            str2 = jSONObject.getString(str);
        }
        return c.d(str2).e();
    }

    public static String a(JSONObject jSONObject) {
        String a = adpw.k.a();
        String str = "videoId";
        if (jSONObject.has(str)) {
            return jSONObject.optString(str, a);
        }
        return jSONObject.optString("video_id", a);
    }

    private static String c(JSONObject jSONObject) {
        return jSONObject.optString("listId", adpw.k.e());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1  */
    private final void d(org.json.JSONObject r11) {
        /*
        r10 = this;
        r0 = "currentTime";
        r1 = r11.has(r0);
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r1 == 0) goto L_0x0016;
    L_0x000a:
        r1 = r10.a;
        r0 = r11.getInt(r0);
        r4 = (long) r0;
        r4 = r4 * r2;
        r1.R = r4;
        goto L_0x0030;
    L_0x0016:
        r0 = "current_time";
        r1 = r11.has(r0);
        if (r1 == 0) goto L_0x002a;
    L_0x001e:
        r1 = r10.a;
        r0 = r11.getInt(r0);
        r4 = (long) r0;
        r4 = r4 * r2;
        r1.R = r4;
        goto L_0x0030;
    L_0x002a:
        r0 = r10.a;
        r4 = 0;
        r0.R = r4;
    L_0x0030:
        r0 = r10.a;
        r1 = "liveIngestionTime";
        r4 = r11.has(r1);
        r0.W = r4;
        r0 = r10.a;
        r4 = r0.W;
        r5 = 0;
        if (r4 == 0) goto L_0x004d;
    L_0x0041:
        r4 = "seekableEndTime";
        r4 = r11.optInt(r4, r5);
        r6 = (long) r4;
        r6 = r6 * r2;
        r0.S = r6;
        goto L_0x0058;
    L_0x004d:
        r4 = "duration";
        r4 = r11.optInt(r4, r5);
        r6 = (long) r4;
        r6 = r6 * r2;
        r0.S = r6;
    L_0x0058:
        r0 = r10.a;
        r0 = r0.W;
        r6 = -1;
        if (r0 == 0) goto L_0x0074;
    L_0x0060:
        r0 = "seekableStartTime";
        r4 = r11.has(r0);
        if (r4 == 0) goto L_0x0074;
    L_0x0068:
        r4 = r10.a;
        r0 = r11.getInt(r0);
        r8 = (long) r0;
        r8 = r8 * r2;
        r4.T = r8;
        goto L_0x0078;
    L_0x0074:
        r0 = r10.a;
        r0.T = r6;
    L_0x0078:
        r0 = r11.has(r1);
        if (r0 == 0) goto L_0x008a;
    L_0x007e:
        r0 = r10.a;
        r1 = r11.getInt(r1);
        r6 = (long) r1;
        r6 = r6 * r2;
        r0.U = r6;
        goto L_0x008e;
    L_0x008a:
        r0 = r10.a;
        r0.U = r6;
    L_0x008e:
        r0 = r10.a;
        r1 = defpackage.adpy.UNSTARTED;
        r1 = r1.n;
        r2 = "state";
        r11 = r11.optInt(r2, r1);
        r1 = defpackage.adpy.values();
        r2 = r1.length;
    L_0x009f:
        if (r5 >= r2) goto L_0x00aa;
    L_0x00a1:
        r3 = r1[r5];
        r4 = r3.n;
        if (r4 == r11) goto L_0x00ac;
    L_0x00a7:
        r5 = r5 + 1;
        goto L_0x009f;
    L_0x00aa:
        r3 = defpackage.adpy.UNSTARTED;
    L_0x00ac:
        r0.a(r3);
        r11 = r10.a;
        r0 = r11.m;
        r0 = r0.b();
        r11.Q = r0;
        r11 = r10.a;
        r11.an = 0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adrs.d(org.json.JSONObject):void");
    }

    private final void e(JSONObject jSONObject) {
        if (this.a.E != null) {
            String str = "currentTime";
            if (jSONObject.has(str)) {
                this.a.R = TimeUnit.SECONDS.toMillis((long) jSONObject.getInt(str));
                adro adro = this.a;
                adro.Q = adro.m.b();
                this.a.an = 0;
            }
        }
    }

    private final void f(JSONObject jSONObject) {
        adro adro = this.a;
        if (adro.E != null) {
            adro.F = jSONObject.optInt("podPosition", 0);
            this.a.G = jSONObject.optInt("podLength", 0);
            this.a.H = jSONObject.optLong("podRemainingTime", 0);
            adro adro2 = this.a;
            adro2.I = adro2.m.b();
        }
    }

    private final void g(JSONObject jSONObject) {
        if (this.a.E != null) {
            String str = "adState";
            if (jSONObject.has(str)) {
                adpy adpy;
                adro adro = this.a;
                int i = jSONObject.getInt(str);
                if (i == adpy.UNSTARTED.n) {
                    adpy = adpy.AD_UNSTARTED;
                } else if (i == adpy.ENDED.n) {
                    adpy = adpy.AD_ENDED;
                } else if (i == adpy.AD_SKIPPED.n) {
                    adpy = adpy.AD_SKIPPED;
                } else if (i == adpy.PLAYING.n) {
                    adpy = adpy.AD_PLAYING;
                } else if (i == adpy.PAUSED.n) {
                    adpy = adpy.AD_PAUSED;
                } else if (i != adpy.BUFFERING.n) {
                    str = adpy.m;
                    StringBuilder stringBuilder = new StringBuilder(47);
                    stringBuilder.append("YouTube MDx: invalid ad state code ");
                    stringBuilder.append(i);
                    stringBuilder.append(".");
                    xtl.a(str, stringBuilder.toString());
                    adpy = adpy.AD_UNSTARTED;
                } else {
                    adpy = adpy.AD_BUFFERING;
                }
                adro.a(adpy);
            }
        }
    }

    /* synthetic */ adrs(adro adro) {
        this.a = adro;
    }
}
