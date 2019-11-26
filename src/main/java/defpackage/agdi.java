package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: agdi */
public final class agdi {
    public final agfi a;
    public final xsc b;
    private final bcaa c;
    private final bcaa d;
    private final long e;

    public agdi(bcaa bcaa, bcaa bcaa2, agfi agfi, xsc xsc, long j) {
        this.a = (agfi) amqw.a((Object) agfi);
        this.d = (bcaa) amqw.a((Object) bcaa2);
        this.c = (bcaa) amqw.a((Object) bcaa);
        this.b = (xsc) amqw.a((Object) xsc);
        this.e = j;
    }

    public final String a(String str, aakj aakj) {
        xak.b();
        List c = ((afyi) this.c.get()).c(aakj);
        if (c == null || c.isEmpty()) {
            this.a.a(str, Collections.emptySet());
            a(str, Collections.emptyList());
            return null;
        }
        vsd vsd = (vsd) c.get(0);
        vse a = a(vsd);
        if (a != null) {
            Set singleton;
            String d = a.d();
            if (d != null) {
                singleton = Collections.singleton(d);
            } else {
                singleton = Collections.emptySet();
            }
            this.a.a(str, singleton);
            String str2 = "]";
            if (!a(str, c)) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 40);
                stringBuilder.append("Error saving adbreaks [originalVideoId=");
                stringBuilder.append(str);
                stringBuilder.append(str2);
                xtl.c(stringBuilder.toString());
                return null;
            } else if (vsd != null) {
                aakj s = aakj.s();
                xak.b();
                SQLiteDatabase f;
                try {
                    agfi agfi = this.a;
                    String str3 = vsd.f;
                    Object obj = vsd.g;
                    xvd.a(str3);
                    amqw.a(obj);
                    amqw.a((Object) a);
                    f = agfi.f();
                    f.beginTransaction();
                    if (agfi.c.b(str3) && agfi.e.a(str3)) {
                        SQLiteDatabase a2 = agfi.f.c.a();
                        String str4 = "ads";
                        ContentValues a3 = ages.a(a);
                        a3.put("original_video_id", str3);
                        a3.put("ad_break_id", obj);
                        if (s != null) {
                            a3.put("ad_intro_video_id", s.b());
                            a3.put("ad_intro_player_response", s.w());
                        }
                        a2.insert(str4, null, a3);
                        if (a.d() != null) {
                            str = a.d();
                            if (!agfi.g.a(str)) {
                                ageq ageq = agfi.g;
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("ad_video_id", str);
                                contentValues.put("playback_count", Integer.valueOf(0));
                                contentValues.put("status", Integer.valueOf(agqf.ACTIVE.p));
                                ageq.b.a().insert("ad_videos", null, contentValues);
                                for (agfh a4 : agfi.a) {
                                    a4.a(str, avsi.UNKNOWN_FORMAT_TYPE, 1);
                                }
                            }
                        }
                        f.setTransactionSuccessful();
                        f.endTransaction();
                        if (a.d() != null) {
                            this.a.x(a.d());
                        }
                        return d;
                    }
                    f.endTransaction();
                } catch (IOException e) {
                    String str5 = vsd.f;
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str5).length() + 43);
                    stringBuilder2.append("Error saving instream ad [originalVideoId=");
                    stringBuilder2.append(str5);
                    stringBuilder2.append(str2);
                    xtl.a(stringBuilder2.toString(), e);
                } catch (Throwable th) {
                    f.endTransaction();
                }
            }
        }
        return null;
    }

    private final boolean a(String str, List list) {
        xak.b();
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    return this.a.a(str, list);
                }
            } catch (IOException e) {
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 48);
                stringBuilder.append("Error saving ad breaks for ad [originalVideoId=");
                stringBuilder.append(str);
                stringBuilder.append("]");
                xtl.a(stringBuilder.toString(), e);
                return false;
            }
        }
        this.a.a(str, Collections.emptyList());
        return false;
    }

    private final vse a(vsd vsd) {
        vsd vsd2 = vsd;
        String str = "]";
        xak.b();
        StringBuilder stringBuilder;
        try {
            List a = ((afyi) this.c.get()).a(vsd2, new xvk(this.b, this.e));
            if (a.isEmpty()) {
                return null;
            }
            vse vse = (vse) a.get(0);
            if (!vse.o()) {
                if (TextUtils.isEmpty(vse.d())) {
                    String str2 = vsd2.f;
                    stringBuilder = new StringBuilder(String.valueOf(str2).length() + 52);
                    stringBuilder.append("Error loading non-YouTube-hosted ad video [request=");
                    stringBuilder.append(str2);
                    stringBuilder.append(str);
                    xtl.c(stringBuilder.toString());
                    return null;
                }
            }
            if (vse.a instanceof vtk) {
                aajx aajx = (aajx) this.d.get();
                this.b.a();
                vtk vtk = (vtk) vse.a;
                vse = new vse(new vtk(vtk.d, vtk.e, vtk.f, vtk.g, vtk.h, vtk.j, vtk.k, vtk.a, vtk.b.b(aajx)));
            }
            return vse;
        } catch (TimeoutException e) {
            String str3 = vsd2.f;
            stringBuilder = new StringBuilder(String.valueOf(str3).length() + 48);
            stringBuilder.append("Timeout error loading vast ad [originalVideoId=");
            stringBuilder.append(str3);
            stringBuilder.append(str);
            xtl.a(stringBuilder.toString(), e);
            return null;
        } catch (aocg e2) {
            xtl.a("Error updating ad player response for offline", e2);
            return null;
        }
    }

    static {
        TimeUnit.SECONDS.toMillis(15);
    }
}
