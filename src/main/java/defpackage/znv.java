package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.DataSetObservable;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: znv */
public final class znv implements zjx, zjy, znt {
    public final znp a;
    public final ArrayList b = new ArrayList();
    public byte[] c;
    public final Object d = new Object();
    public zob e;
    public zoc f;
    private final SharedPreferences g;
    private final ArrayList h = new ArrayList();
    private final Map i = new HashMap();
    private final Set j = EnumSet.noneOf(ayzc.class);
    private DataSetObservable k;
    private boolean l;

    public znv(Context context, xhf xhf, SharedPreferences sharedPreferences) {
        this.g = sharedPreferences;
        this.a = new znp(context, xhf, this);
    }

    public final ayyw a() {
        ayyv ayyv = (ayyv) ayyw.d.createBuilder();
        List asList = Arrays.asList(this.a.a());
        ayyv.copyOnWrite();
        ayyw ayyw = (ayyw) ayyv.instance;
        if (!ayyw.b.a()) {
            ayyw.b = anxl.mutableCopy(ayyw.b);
        }
        anvf.addAll(asList, ayyw.b);
        zkg zkg = new zkg();
        zkg.a();
        String str = zkg.e;
        zkg.a();
        String str2 = zkg.f;
        ayyt ayyt = (ayyt) ayyu.d.createBuilder();
        if (str != null) {
            ayyt.copyOnWrite();
            ayyu ayyu = (ayyu) ayyt.instance;
            ayyu.a |= 1;
            ayyu.b = str;
        }
        if (str2 != null) {
            ayyt.copyOnWrite();
            ayyu ayyu2 = (ayyu) ayyt.instance;
            ayyu2.a |= 2;
            ayyu2.c = str2;
        }
        ayyx ayyx = (ayyx) ayyy.d.createBuilder();
        try {
            str = Build.DEVICE;
            ayyx.copyOnWrite();
            ayyy ayyy = (ayyy) ayyx.instance;
            if (str != null) {
                ayyy.a |= 2;
                ayyy.c = str;
                ayyx.copyOnWrite();
                ayyy ayyy2 = (ayyy) ayyx.instance;
                ayyy2.b = (ayyu) ((anxl) ayyt.build());
                ayyy2.a |= 1;
                ayyv.copyOnWrite();
                ayyw = (ayyw) ayyv.instance;
                ayyw.c = (ayyy) ((anxl) ayyx.build());
                ayyw.a |= 1;
                return (ayyw) ((anxl) ayyv.build());
            }
            throw new NullPointerException();
        } catch (RuntimeException e) {
            xtl.b("Failed to set VideoEffectsContext.Device.device: ", e);
        }
    }

    public final void a(azaj azaj) {
        a(azaj, true);
    }

    public final void a(azaj azaj, boolean z) {
        String str;
        boolean z2 = false;
        String str2;
        if (azaj == null) {
            str2 = !z ? "Built-in fallback not allowed." : "Using built-in effects.";
            str = "No VideoEffectsSettings provided. ";
            xtl.e(str2.length() == 0 ? new String(str) : str.concat(str2));
        } else {
            z2 = b(azaj, false);
            if (!z2) {
                str2 = !z ? "Built-in fallback not allowed." : "Using built-in effects.";
                str = "VideoEffectsSettings from InnerTube is invalid. ";
                if (str2.length() == 0) {
                    str2 = new String(str);
                } else {
                    str2 = str.concat(str2);
                }
                xtl.c(str2);
            }
        }
        boolean z3 = true;
        if (z && !z2) {
            this.b.clear();
            this.i.clear();
            this.j.clear();
            String str3 = "android_builtin_effects_settings.binarypb";
            try {
                InputStream open = this.a.b.getAssets().open(str3);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                znp.a(open, byteArrayOutputStream);
                azaj azaj2 = (azaj) anxl.parseFrom(azaj.h, byteArrayOutputStream.toByteArray(), anxa.c());
                open.close();
                byteArrayOutputStream.close();
                amqw.b(b(azaj2, true));
            } catch (IOException e) {
                str = "Failed to load or parse: ";
                throw new RuntimeException(str3.length() == 0 ? new String(str) : str.concat(str3), e);
            }
        }
        z3 = z2;
        synchronized (this.d) {
            this.l = z3;
            c();
        }
    }

    private final boolean b(azaj azaj, boolean z) {
        String str;
        String str2;
        azaj azaj2 = azaj;
        amqw.a(this.b.isEmpty());
        amqw.a(this.i.isEmpty());
        amqw.a(this.j.isEmpty());
        amqw.a((Object) azaj);
        this.c = azaj2.c.d();
        HashSet hashSet = new HashSet();
        Iterator it = azaj2.b.iterator();
        Object obj = null;
        while (true) {
            str = "NORMAL";
            if (!it.hasNext()) {
                break;
            }
            azag azag = (azag) it.next();
            arml arml = azag.c;
            if (arml == null) {
                arml = arml.f;
            }
            Spanned a = ajqy.a(arml);
            CharSequence obj2 = a != null ? a.toString() : null;
            String str3 = azag.b;
            if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(obj2)) {
                boolean z2 = z;
                afpf afpf = afpf.upload;
                String valueOf = String.valueOf(azag.toString().replace('\"', '`'));
                str2 = "Invalid effect from server: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                afpc.a(2, afpf, valueOf, new Exception());
                String valueOf2 = String.valueOf(azag);
                StringBuilder stringBuilder = new StringBuilder(valueOf2.length() + 28);
                stringBuilder.append(str2);
                stringBuilder.append(valueOf2);
                xtl.c(stringBuilder.toString());
            } else {
                boolean z3 = azag.d.size() != 0;
                this.b.add(new zjt(str3, obj2, z3, z));
                if (z3) {
                    this.i.put(str3, new HashSet(azag.d));
                    hashSet.addAll(azag.d);
                }
                if (str3.equals(str)) {
                    obj = 1;
                }
            }
        }
        for (azae azae : azaj2.g) {
            ayza a2 = ayza.a(azae.b);
            if (a2 == null) {
                a2 = ayza.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
            }
            zjv zjv = new zjv(a2);
            zjv.a(zjt.a(this.b, str));
            for (String str22 : azae.c) {
                if (str.equals(str22)) {
                    Object a3 = ayza.a(azae.b);
                    if (a3 == null) {
                        a3 = ayza.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
                    }
                    String valueOf3 = String.valueOf(a3);
                    StringBuilder stringBuilder2 = new StringBuilder(valueOf3.length() + 36);
                    stringBuilder2.append(valueOf3);
                    stringBuilder2.append(": Skipping NORMAL (implicitly added)");
                    xtl.e(stringBuilder2.toString());
                } else {
                    zjt a4 = zjt.a(this.b, str22);
                    if (a4 != null) {
                        zjv.a(a4);
                    } else {
                        Object a5 = ayza.a(azae.b);
                        if (a5 == null) {
                            a5 = ayza.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
                        }
                        String valueOf4 = String.valueOf(a5);
                        StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(str22).length() + 33) + valueOf4.length());
                        stringBuilder3.append("Invalid Effect ID ");
                        stringBuilder3.append(str22);
                        stringBuilder3.append(" in subpackage ");
                        stringBuilder3.append(valueOf4);
                        xtl.c(stringBuilder3.toString());
                    }
                }
            }
            this.h.add(zjv);
        }
        hashSet.addAll(azaj2.d);
        if ((azaj2.a & 2) != 0) {
            Set set = this.j;
            azai azai = azaj2.f;
            if (azai == null) {
                azai = azai.c;
            }
            set.addAll(new anyc(azai.a, azai.b));
        }
        new zoa(this, azaj2, hashSet).execute(new Void[0]);
        byte[] bArr = this.c;
        if (bArr == null || bArr.length <= 0 || obj == null) {
            return false;
        }
        return true;
    }

    public final znq b() {
        return (this.c == null || this.b.isEmpty()) ? null : new znz(this);
    }

    public final void a(DataSetObservable dataSetObservable) {
        this.k = (DataSetObservable) amqw.a((Object) dataSetObservable);
    }

    public final void a(String str, String str2) {
        boolean z = false;
        for (String str3 : this.i.keySet()) {
            String str32;
            Set set = (Set) this.i.get(str32);
            if (set.contains(str)) {
                set.remove(str);
                if (set.isEmpty()) {
                    ArrayList arrayList = this.b;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        zjt zjt = (zjt) arrayList.get(i);
                        i++;
                        if (zjt.a.equals(str32)) {
                            zjt.b = false;
                            String valueOf = String.valueOf(str32);
                            str32 = "A new effect is ready: ";
                            if (valueOf.length() == 0) {
                                valueOf = new String(str32);
                            } else {
                                str32.concat(valueOf);
                            }
                            z = true;
                        }
                    }
                }
            }
        }
        DataSetObservable dataSetObservable = this.k;
        if (dataSetObservable != null && z) {
            dataSetObservable.notifyChanged();
        }
        zoc zoc = this.f;
        if (zoc != null) {
            zoc.a(str2, z);
        }
    }

    public final boolean a(ayzc ayzc) {
        return ayzc != null && this.j.contains(ayzc);
    }

    public final void c() {
        zob zob = this.e;
        if (zob != null && this.l) {
            zob.a(this.c, this.j, this.b, this.h, this.a.b(), this.g);
            this.e = null;
        }
    }
}
