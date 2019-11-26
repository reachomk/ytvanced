package defpackage;

import android.os.Build.VERSION;
import android.text.Html;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: abnr */
public final class abnr implements abnq {
    private final byte[] a;
    private anuc b;

    public abnr(byte[] bArr) {
        this.a = bArr;
    }

    public final int a() {
        return 2;
    }

    public abnr(byte[] bArr, byte b) {
        this.a = bArr;
        HashMap hashMap = new HashMap();
    }

    public final byte[] b() {
        byte[] bArr = this.a;
        if (bArr == null) {
            anuc anuc = this.b;
            if (anuc != null) {
                return anuc.toByteArray();
            }
            bArr = null;
        }
        return bArr;
    }

    public final abnp c() {
        byte[] bArr = this.a;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            this.b = (anuc) anxl.parseFrom(anuc.d, bArr);
            if (this.b == null) {
                return null;
            }
            boolean z;
            Map unmodifiableMap;
            ArrayList arrayList = new ArrayList(10);
            anuc anuc = this.b;
            if ((anuc.a & 2) != 0) {
                anuj anuj = anuc.c;
                if (anuj == null) {
                    anuj = anuj.e;
                }
                z = anuj.b;
                if ((anuj.a & 524288) != 0) {
                    anub anub = anuj.c;
                    if (anub == null) {
                        anub = anub.b;
                    }
                    unmodifiableMap = Collections.unmodifiableMap(anub.a);
                } else {
                    unmodifiableMap = null;
                }
            } else {
                unmodifiableMap = null;
                z = false;
            }
            Object obj = null;
            for (anue anue : this.b.b) {
                Spanned fromHtml;
                int[] iArr;
                String str;
                String str2;
                int i;
                int i2;
                String str3;
                if (VERSION.SDK_INT >= 24) {
                    fromHtml = Html.fromHtml(anue.b, 63);
                } else {
                    fromHtml = Html.fromHtml(anue.b);
                }
                Spanned spanned = fromHtml;
                String obj2 = spanned.toString();
                int a = aodp.a(anue.c);
                if (a == 0) {
                    a = 1;
                }
                a--;
                if (anue.d.size() > 0) {
                    int[] iArr2 = new int[anue.d.size()];
                    for (int i3 = 0; i3 < iArr2.length; i3++) {
                        iArr2[i3] = ((aodn) new anyc(anue.d, anue.e).get(i3)).b;
                    }
                    iArr = iArr2;
                } else {
                    iArr = null;
                }
                if ((anue.a & 4) == 0) {
                    str = null;
                    str2 = str;
                    i = 0;
                    i2 = -1;
                } else {
                    int i4;
                    antw antw = anue.f;
                    if (antw == null) {
                        antw = antw.f;
                    }
                    String str4 = antw.e;
                    if (unmodifiableMap != null) {
                        i4 = antw.b;
                        str = (String) unmodifiableMap.get(Integer.valueOf(i4));
                    } else {
                        str = null;
                        i4 = 0;
                    }
                    if ((antw.a & 64) != 0) {
                        i2 = antw.c;
                        i = i4;
                        str2 = str;
                        obj = 1;
                    } else {
                        i = i4;
                        str2 = str;
                        i2 = -1;
                    }
                    str = str4;
                }
                if ((anue.a & 128) != 0) {
                    antu antu = anue.g;
                    if (antu == null) {
                        antu = antu.c;
                    }
                    str3 = antu.b;
                } else {
                    str3 = null;
                }
                arrayList.add(new abnv(obj2, a, abnv.k, iArr, str, i, str2, i2, str3, spanned));
            }
            if (obj != null) {
                Collections.sort(arrayList);
            }
            return new abnp(arrayList, z);
        } catch (anyg unused) {
            return null;
        }
    }
}
