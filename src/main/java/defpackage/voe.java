package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: voe */
public final class voe {
    public final SharedPreferences a;

    public voe(SharedPreferences sharedPreferences) {
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
    }

    public final void a(String str, boolean z) {
        this.a.edit().putBoolean(str, z).commit();
    }

    public final void a(String str, String str2) {
        this.a.edit().putString(str, str2).commit();
    }

    public final void a(String str) {
        this.a.edit().remove(str).commit();
    }

    public final boolean a() {
        return this.a.getBoolean("debugAdEnable", false);
    }

    public final void a(boolean z) {
        a("debugAdEnable", z);
    }

    public final boolean b() {
        return this.a.getBoolean("forceWatchAdEnable", false);
    }

    public final void b(boolean z) {
        a("forceWatchAdEnable", z);
    }

    public final List c() {
        String string;
        try {
            JSONArray jSONArray;
            string = this.a.getString("debugAdBreaks", "");
            if (TextUtils.isEmpty(string)) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = new JSONArray(string);
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(vog.a((JSONObject) jSONArray.get(i), 1));
            }
            return arrayList;
        } catch (JSONException e) {
            string = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(string.length() + 75);
            stringBuilder.append("JSON exception when retrieving debug adBreak list from system preferences: ");
            stringBuilder.append(string);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public final arkp[] d() {
        List<voh> c = c();
        ArrayList arrayList = new ArrayList(c.size());
        for (voh voh : c) {
            if (voh.b != vsm.MID_ROLL || voh.c != -1) {
                arko arko = (arko) arkp.i.createBuilder();
                int ordinal = voh.b.ordinal();
                if (ordinal == 0) {
                    arko.a(2);
                } else if (ordinal == 1) {
                    arko.a(3);
                    arkq arkq = (arkq) arkr.d.createBuilder();
                    arkq.copyOnWrite();
                    arkr arkr = (arkr) arkq.instance;
                    arkr.a |= 1;
                    arkr.b = 2;
                    int i = voh.c;
                    arkq.copyOnWrite();
                    arkr arkr2 = (arkr) arkq.instance;
                    arkr2.a |= 2;
                    arkr2.c = (long) i;
                    arko.copyOnWrite();
                    arkp arkp = (arkp) arko.instance;
                    arkp.c = (arkr) ((anxl) arkq.build());
                    arkp.a |= 2;
                } else if (ordinal == 2) {
                    arko.a(4);
                }
                String str;
                arkp arkp2;
                if (voh.j) {
                    String valueOf = String.valueOf(voh.a.h);
                    String str2 = "https://afimplex.appspot.com/mobile/";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str2);
                    } else {
                        valueOf = str2.concat(valueOf);
                    }
                    int i2 = voh.a.i;
                    int i3 = i2 - 1;
                    if (i2 == 0) {
                        throw null;
                    } else if (i3 == 0) {
                        arko.a(valueOf);
                    } else if (i3 == 1) {
                        arko.b(valueOf);
                    }
                } else if (voh.i) {
                    str = voh.g;
                    arko.copyOnWrite();
                    arkp2 = (arkp) arko.instance;
                    if (str != null) {
                        arkp2.a |= 8;
                        arkp2.e = str;
                    } else {
                        throw new NullPointerException();
                    }
                } else if (TextUtils.isEmpty(voh.h)) {
                    long j = voh.d;
                    if (j > 0) {
                        arko.copyOnWrite();
                        arkp arkp3 = (arkp) arko.instance;
                        arkp3.a |= 16;
                        arkp3.f = j;
                    } else if (!TextUtils.isEmpty(voh.e)) {
                        str = voh.e;
                        arko.copyOnWrite();
                        arkp2 = (arkp) arko.instance;
                        if (str != null) {
                            arkp2.a |= 32;
                            arkp2.g = str;
                        } else {
                            throw new NullPointerException();
                        }
                    } else if (!TextUtils.isEmpty(voh.f)) {
                        arko.b(voh.f);
                    }
                } else {
                    arko.a(voh.h);
                }
                arrayList.add((arkp) ((anxl) arko.build()));
            }
        }
        arkp[] arkpArr = new arkp[arrayList.size()];
        arrayList.toArray(arkpArr);
        return arkpArr;
    }

    public final void a(List list) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                JSONObject jSONObject = new JSONObject();
                ((vog) ((voh) list.get(i)).c()).a(jSONObject);
                jSONArray.put(jSONObject);
            }
            a("debugAdBreaks", jSONArray.toString());
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 67);
            stringBuilder.append("JSON exception when assigning debug adBreak to system preferences: ");
            stringBuilder.append(valueOf);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public final void a(voj voj, boolean z) {
        a(voj.d, z);
    }

    public final voi a(voj voj) {
        return voi.a(this.a.getString(voj.e, voi.NONE.name()));
    }

    public final String b(voj voj) {
        return this.a.getString(voj.f, null);
    }

    public final String c(voj voj) {
        return this.a.getString(voj.g, null);
    }
}
