package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dem */
public final class dem {
    private final String a;

    public dem(String str) {
        this.a = str;
    }

    /* Access modifiers changed, original: final */
    public final Bundle a(der der, Bundle bundle) {
        Bundle h = der.h();
        if (h != null) {
            bundle.putAll(h);
        }
        String valueOf = String.valueOf(this.a);
        String str = "persistent";
        bundle.putInt(str.length() == 0 ? new String(valueOf) : valueOf.concat(str), der.e());
        valueOf = String.valueOf(this.a);
        str = "recurring";
        bundle.putBoolean(str.length() == 0 ? new String(valueOf) : valueOf.concat(str), der.f());
        valueOf = String.valueOf(this.a);
        str = "replace_current";
        bundle.putBoolean(str.length() == 0 ? new String(valueOf) : valueOf.concat(str), der.j());
        valueOf = String.valueOf(this.a);
        str = "tag";
        bundle.putString(str.length() == 0 ? new String(valueOf) : valueOf.concat(str), der.c());
        valueOf = String.valueOf(this.a);
        str = "service";
        bundle.putString(str.length() == 0 ? new String(valueOf) : valueOf.concat(str), der.b());
        valueOf = String.valueOf(this.a);
        str = "constraints";
        bundle.putInt(str.length() == 0 ? new String(valueOf) : valueOf.concat(str), ddm.a(der.g()));
        dew d = der.d();
        String str2 = "trigger_type";
        if (d == dfe.a) {
            valueOf = String.valueOf(this.a);
            bundle.putInt(str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2), 2);
        } else if (d instanceof dey) {
            dey dey = (dey) d;
            str = String.valueOf(this.a);
            if (str2.length() == 0) {
                str2 = new String(str);
            } else {
                str2 = str.concat(str2);
            }
            bundle.putInt(str2, 1);
            str = String.valueOf(this.a);
            str2 = "window_start";
            if (str2.length() == 0) {
                str2 = new String(str);
            } else {
                str2 = str.concat(str2);
            }
            bundle.putInt(str2, dey.a);
            str = String.valueOf(this.a);
            str2 = "window_end";
            if (str2.length() == 0) {
                str2 = new String(str);
            } else {
                str2 = str.concat(str2);
            }
            bundle.putInt(str2, dey.b);
        } else if (d instanceof dez) {
            str = String.valueOf(this.a);
            bundle.putInt(str2.length() == 0 ? new String(str) : str.concat(str2), 3);
            List<dfd> list = ((dez) d).a;
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            for (dfd dfd : list) {
                jSONArray.put(dfd.b);
                jSONArray2.put(dfd.a);
            }
            try {
                jSONObject.put("uri_flags", jSONArray);
                jSONObject.put("uris", jSONArray2);
                valueOf = jSONObject.toString();
                str = String.valueOf(this.a);
                str2 = "observed_uris";
                bundle.putString(str2.length() == 0 ? new String(str) : str.concat(str2), valueOf);
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported trigger.");
        }
        dfc i = der.i();
        if (i == null) {
            i = dfc.a;
        }
        valueOf = String.valueOf(this.a);
        str = "retry_policy";
        if (str.length() == 0) {
            str = new String(valueOf);
        } else {
            str = valueOf.concat(str);
        }
        bundle.putInt(str, i.b);
        valueOf = String.valueOf(this.a);
        str = "initial_backoff_seconds";
        if (str.length() == 0) {
            str = new String(valueOf);
        } else {
            str = valueOf.concat(str);
        }
        bundle.putInt(str, i.c);
        valueOf = String.valueOf(this.a);
        str = "maximum_backoff_seconds";
        if (str.length() == 0) {
            str = new String(valueOf);
        } else {
            str = valueOf.concat(str);
        }
        bundle.putInt(str, i.d);
        return bundle;
    }

    public final deo a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (bundle2 != null) {
            int i;
            int length;
            String str;
            dew a;
            String str2;
            String valueOf;
            dfc dfc;
            Bundle bundle3 = new Bundle(bundle2);
            String valueOf2 = String.valueOf(this.a);
            String str3 = "recurring";
            boolean z = bundle3.getBoolean(str3.length() == 0 ? new String(valueOf2) : valueOf2.concat(str3));
            str3 = String.valueOf(this.a);
            String str4 = "replace_current";
            boolean z2 = bundle3.getBoolean(str4.length() == 0 ? new String(str3) : str3.concat(str4));
            str4 = String.valueOf(this.a);
            String str5 = "persistent";
            int i2 = bundle3.getInt(str5.length() == 0 ? new String(str4) : str4.concat(str5));
            str5 = String.valueOf(this.a);
            String str6 = "constraints";
            int i3 = bundle3.getInt(str6.length() == 0 ? new String(str5) : str5.concat(str6));
            int[] iArr = ddm.a;
            int length2 = iArr.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = 1;
                if (i4 >= length2) {
                    break;
                }
                i = iArr[i4];
                if ((i3 & i) != i) {
                    i6 = 0;
                }
                i5 += i6;
                i4++;
            }
            iArr = new int[i5];
            i = 0;
            for (int length3 : ddm.a) {
                if ((i3 & length3) == length3) {
                    int i7 = i + 1;
                    iArr[i] = length3;
                    i = i7;
                }
            }
            str5 = String.valueOf(this.a);
            String str7 = "trigger_type";
            i3 = bundle3.getInt(str7.length() == 0 ? new String(str5) : str5.concat(str7));
            if (i3 == 1) {
                str5 = String.valueOf(this.a);
                str7 = "window_start";
                if (str7.length() == 0) {
                    str7 = new String(str5);
                } else {
                    str7 = str5.concat(str7);
                }
                i3 = bundle3.getInt(str7);
                str7 = String.valueOf(this.a);
                str = "window_end";
                if (str.length() == 0) {
                    str = new String(str7);
                } else {
                    str = str7.concat(str);
                }
                a = dfe.a(i3, bundle3.getInt(str));
            } else if (i3 == 2) {
                a = dfe.a;
            } else if (i3 != 3) {
                a = null;
            } else {
                str5 = String.valueOf(this.a);
                str2 = "observed_uris";
                if (str2.length() == 0) {
                    str2 = new String(str5);
                } else {
                    str2 = str5.concat(str2);
                }
                str5 = bundle3.getString(str2);
                ArrayList arrayList = new ArrayList();
                try {
                    JSONObject jSONObject = new JSONObject(str5);
                    JSONArray jSONArray = jSONObject.getJSONArray("uri_flags");
                    JSONArray jSONArray2 = jSONObject.getJSONArray("uris");
                    length3 = jSONArray.length();
                    for (int i8 = 0; i8 < length3; i8++) {
                        arrayList.add(new dfd(Uri.parse(jSONArray2.getString(i8)), jSONArray.getInt(i8)));
                    }
                    a = dfe.a(Collections.unmodifiableList(arrayList));
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
            str5 = String.valueOf(this.a);
            str = "retry_policy";
            i3 = bundle3.getInt(str.length() == 0 ? new String(str5) : str5.concat(str));
            if (i3 == 1 || i3 == 2) {
                valueOf = String.valueOf(this.a);
                str2 = "initial_backoff_seconds";
                i4 = bundle3.getInt(str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2));
                str2 = String.valueOf(this.a);
                String str8 = "maximum_backoff_seconds";
                dfc = new dfc(i3, i4, bundle3.getInt(str8.length() == 0 ? new String(str2) : str2.concat(str8)));
            } else {
                dfc = dfc.a;
            }
            str = String.valueOf(this.a);
            valueOf = "tag";
            str = bundle3.getString(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            valueOf = String.valueOf(this.a);
            str2 = "service";
            valueOf = bundle3.getString(str2.length() == 0 ? new String(valueOf) : valueOf.concat(str2));
            if (str == null || valueOf == null || a == null || dfc == null) {
                return null;
            }
            deo deo = new deo();
            deo.a = str;
            deo.b = valueOf;
            deo.c = a;
            deo.h = dfc;
            deo.d = z;
            deo.e = i2;
            deo.f = iArr;
            deo.i = z2;
            if (!TextUtils.isEmpty(this.a)) {
                Iterator it = bundle3.keySet().iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).startsWith(this.a)) {
                        it.remove();
                    }
                }
            }
            deo.g.putAll(bundle3);
            return deo;
        }
        throw new IllegalArgumentException("Unexpected null Bundle provided");
    }
}
