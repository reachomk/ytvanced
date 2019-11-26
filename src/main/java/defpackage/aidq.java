package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.youtube.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aidq */
public final class aidq implements afid, aidn, aiee, OnSharedPreferenceChangeListener, Observer {
    private final afmi A;
    private final xhv B;
    private final xry C;
    private final afjv D;
    private final amro E;
    private final xoi F;
    private final ajam G;
    private final zyw H;
    private final BatteryManager I;
    private int J;
    private long K;
    private aidw L;
    private final bdfu M = new bdfu();
    public final aido a;
    public final amro b;
    public final amro c;
    public final amro d;
    public String e;
    public String f;
    public int g;
    public int h;
    public aahr i;
    public aahr j;
    public aaju k;
    public atwo[] l;
    public atwo[] m;
    public final aiea n = new aiea(this);
    public final aidp o = new aidp(this);
    public final aidx p = new aidx(this);
    public boolean q;
    public long r;
    public final HashMap s;
    public final xrt t;
    public float u;
    public float v;
    private final Context w;
    private final SharedPreferences x;
    private final xci y;
    private final afia z;

    public aidq(aido aido, Context context, SharedPreferences sharedPreferences, xci xci, afia afia, afmi afmi, xhv xhv, xry xry, afjv afjv, amro amro, amro amro2, amro amro3, amro amro4, ajam ajam, zyw zyw) {
        Context context2 = context;
        xhv xhv2 = xhv;
        Object xns = new xns(context, xhv);
        this.a = (aido) amqw.a((Object) aido);
        this.a.a((aidn) this);
        this.w = (Context) amqw.a((Object) context);
        this.x = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.y = (xci) amqw.a((Object) xci);
        this.z = (afia) amqw.a((Object) afia);
        this.A = (afmi) amqw.a((Object) afmi);
        this.B = (xhv) amqw.a((Object) xhv);
        this.C = (xry) amqw.a((Object) xry);
        this.D = (afjv) amqw.a((Object) afjv);
        this.b = (amro) amqw.a((Object) amro);
        this.c = (amro) amqw.a((Object) amro2);
        this.d = (amro) amqw.a((Object) amro3);
        this.E = (amro) amqw.a((Object) amro4);
        this.F = (xoi) amqw.a(xns);
        this.G = ajam;
        this.H = zyw;
        this.I = VERSION.SDK_INT >= 21 ? (BatteryManager) context.getSystemService("batterymanager") : null;
        this.s = new HashMap();
        this.t = new xrt(context);
    }

    public final void a(int i) {
    }

    public final void a(long j, long j2) {
    }

    public final void a() {
        if (this.q) {
            this.q = false;
            this.a.c();
            if (aipo.a(this.H, 32768)) {
                this.M.a();
            } else {
                this.y.b(this.L);
            }
            this.z.b(this);
            this.x.unregisterOnSharedPreferenceChangeListener(this);
            this.D.deleteObserver(this);
        }
    }

    public final void b() {
        if (this.q) {
            a();
            return;
        }
        if (this.L == null) {
            this.L = new aidw(this);
        }
        this.q = true;
        this.a.bB_();
        aido aido = this.a;
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        String str3 = VERSION.RELEASE;
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 2) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append(str);
        str = " ";
        stringBuilder.append(str);
        stringBuilder.append(str2);
        stringBuilder.append(str);
        stringBuilder.append(str3);
        aido.a(stringBuilder.toString());
        this.a.d(this.e);
        this.a.e(this.f);
        this.a.a(this.i);
        this.a.b(this.j);
        this.a.a(this.t.a(), this.u, this.v);
        this.a.a(this.k);
        this.a.a((afjs) this.D.get());
        f();
        if (aipo.a(this.H, 32768)) {
            this.M.a(this.L.a(this.G));
        } else {
            this.y.a(this.L);
        }
        this.z.a((afid) this);
        this.x.registerOnSharedPreferenceChangeListener(this);
        this.D.addObserver(this);
    }

    public final synchronized float c() {
        float f;
        int i = this.J;
        f = i != 0 ? ((float) (this.K << 3)) / (((float) i) / 1000.0f) : 0.0f;
        this.K = 0;
        this.J = 0;
        return f;
    }

    public final synchronized void a(afin afin) {
        this.J += afin.b;
        this.K += afin.c;
    }

    public final void d() {
        a();
    }

    public final void e() {
        int intValue;
        CharSequence jSONObject;
        xoi xoi = this.F;
        try {
            Object obj;
            JSONObject jSONObject2 = new JSONObject();
            for (Entry entry : this.A.a().entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
            jSONObject2.put("videoid", this.e);
            jSONObject2.put("cpn", this.f);
            jSONObject2.put("fmt", aied.a(this.i));
            jSONObject2.put("afmt", aied.a(this.j));
            jSONObject2.put("bh", this.r);
            jSONObject2.put("conn", this.B.k());
            jSONObject2.put("volume", this.t.a());
            jSONObject2.put("relativeloudness", (double) this.v);
            jSONObject2.put("bat", String.format(Locale.US, "%.3f:%d", new Object[]{Float.valueOf(this.C.a()), Integer.valueOf(this.C.b())}));
            intValue = ((Integer) this.c.get()).intValue() - this.h;
            int intValue2 = ((Integer) this.b.get()).intValue() - this.g;
            StringBuilder stringBuilder = new StringBuilder(23);
            stringBuilder.append(intValue);
            stringBuilder.append("/");
            stringBuilder.append(intValue2);
            jSONObject2.put("df", stringBuilder.toString());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            jSONObject2.put("timestamp", simpleDateFormat.format(new Date()));
            jSONObject2.put("glrenderingmode", this.k);
            jSONObject2.put("drm", ((aerm) this.E.get()).a);
            String str = "error";
            if (this.s.containsKey(this.f)) {
                ArrayList arrayList = (ArrayList) this.s.get(this.f);
                if (arrayList == null) {
                    obj = "";
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        afif afif = (afif) it.next();
                        stringBuilder2.append(afif.a());
                        stringBuilder2.append(",");
                        stringBuilder2.append(afif.c());
                        stringBuilder2.append(";");
                    }
                    obj = stringBuilder2.toString();
                }
            } else {
                obj = "No errors";
            }
            jSONObject2.put(str, obj);
            aidq.a(jSONObject2, this.l);
            aidq.a(jSONObject2, this.m);
            jSONObject = jSONObject2.toString();
        } catch (JSONException unused) {
            jSONObject = null;
        }
        ClipboardManager clipboardManager = (ClipboardManager) this.w.getSystemService("clipboard");
        intValue = R.string.nerd_stats_copy_debug_info_error;
        if (!(jSONObject == null || clipboardManager == null)) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("YouTube Player Debug Info", jSONObject));
            intValue = R.string.nerd_stats_copy_debug_info_success;
        }
        xoi.a(intValue);
    }

    public final void f() {
        aerm aerm = (aerm) this.E.get();
        this.a.f(aerm.a);
        this.a.b(aerm.b);
        this.a.c(aerm.c);
    }

    private static void a(JSONObject jSONObject, atwo[] atwoArr) {
        if (atwoArr != null) {
            for (atwo atwo : atwoArr) {
                String str = atwo.d;
                if (str.startsWith("innertube.build.") || str.equals("e") || str.equals("logged_in")) {
                    jSONObject.put(atwo.d, atwo.b == 2 ? (String) atwo.c : "");
                }
            }
        }
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        String str2 = xay.NERD_STATS_ENABLED;
        if (str2.equals(str) && !sharedPreferences.getBoolean(str2, false)) {
            a();
        }
    }

    public final void update(Observable observable, Object obj) {
        Observable observable2 = this.D;
        if (observable == observable2 && this.q) {
            this.a.a((afjs) observable2.get());
        }
    }
}
