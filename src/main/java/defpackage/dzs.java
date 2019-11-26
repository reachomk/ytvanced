package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SetClientSettingEndpointOuterClass$SetClientSettingEndpoint;
import java.util.Map;

/* renamed from: dzs */
public final class dzs implements aaap {
    private final aaas a;
    private final SharedPreferences b;
    private final alct c;

    public dzs(aaas aaas, SharedPreferences sharedPreferences, alct alct) {
        this.a = aaas;
        this.b = sharedPreferences;
        this.c = alct;
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            SetClientSettingEndpointOuterClass$SetClientSettingEndpoint setClientSettingEndpointOuterClass$SetClientSettingEndpoint = (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint) b;
            Object obj = null;
            for (axfy axfy : setClientSettingEndpointOuterClass$SetClientSettingEndpoint.a) {
                alct alct = this.c;
                axhe axhe = axfy.d;
                if (axhe == null) {
                    axhe = axhe.c;
                }
                int a = axhg.a(axhe.b);
                if (a == 0) {
                    a = 1;
                }
                if (!TextUtils.isEmpty(alct.a(a - 1))) {
                    boolean a2;
                    axhe axhe2 = axfy.d;
                    if (axhe2 == null) {
                        axhe2 = axhe.c;
                    }
                    int a3 = axhg.a(axhe2.b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    a3--;
                    if (a3 == 20) {
                        afxw.a(this.b);
                        a2 = a(axfy);
                    } else if (a3 == 73) {
                        a2 = a(axfy);
                    }
                    if (a2) {
                        obj = 1;
                    }
                }
            }
            if (obj != null) {
                this.a.a(setClientSettingEndpointOuterClass$SetClientSettingEndpoint.b, map);
            }
        }
    }

    private final boolean a(axfy axfy) {
        alct alct = this.c;
        axhe axhe = axfy.d;
        if (axhe == null) {
            axhe = axhe.c;
        }
        int a = axhg.a(axhe.b);
        if (a == 0) {
            a = 1;
        }
        String a2 = alct.a(a - 1);
        boolean z = false;
        if (TextUtils.isEmpty(a2)) {
            return false;
        }
        Editor edit = this.b.edit();
        if (axfy.b == 3) {
            z = ((Boolean) axfy.c).booleanValue();
        }
        edit.putBoolean(a2, z).apply();
        return true;
    }
}
