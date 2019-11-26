package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: alao */
public final class alao extends nf implements OnClickListener {
    public Context Z;
    public alaq a;
    private alad[] aa;
    private alad[] ab;
    private acwl ac;
    private acwc ad;
    private acwc ae;
    private acwc af;
    private int ag;
    private int ah;
    private SharedPreferences ai;
    private Button aj;
    private TextView ak;
    private boolean al;
    private volatile boolean am = false;
    private int an;
    public acxj b;
    public atst c;

    public static alao a(alad[] aladArr, alad[] aladArr2, acwl acwl, acwc acwc, acwc acwc2, acwc acwc3, int i, int i2) {
        return alao.a(aladArr, aladArr2, acwl, acwc, acwc2, acwc3, i, i2, 0);
    }

    public static alao a(alad[] aladArr, alad[] aladArr2, acwl acwl, acwc acwc, acwc acwc2, acwc acwc3, int i, int i2, int i3) {
        amqw.a((Object) aladArr);
        alao alao = new alao();
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("REQUIRED_PERMISSIONS", aladArr);
        bundle.putParcelableArray("OPTIONAL_PERMISSIONS", aladArr2);
        bundle.putInt("PAGE_VE_TYPE", acwl.aH);
        bundle.putString("ALLOW_ACCESS_BUTTON_VE_TYPE", acwc.name());
        bundle.putString("CANCEL_BUTTON_VE_TYPE", acwc2.name());
        bundle.putString("OPEN_APP_SETTING_BUTTON_VE_TYPE", acwc3.name());
        bundle.putInt("ALLOW_ACCESS_DESCRIPTION_RES_ID", i);
        bundle.putInt("OPEN_SETTING_DESCRIPTION_RES_ID", i2);
        bundle.putInt("TITLE_RES_ID_KEY", i3);
        alao.f(bundle);
        return alao;
    }

    public final void B() {
        super.B();
        if (this.al && !alao.a(p(), this.aa)) {
            alaq alaq = this.a;
            if (alaq != null) {
                alaq.s_();
            }
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        r0 = new Object[2];
        int i = 0;
        r0[0] = this.y;
        r0[1] = p();
        ((alas) xtx.a(alas.class, r0)).b().a(this);
        bundle = this.j;
        Parcelable[] parcelableArray = bundle.getParcelableArray("REQUIRED_PERMISSIONS");
        this.aa = new alad[parcelableArray.length];
        for (int i2 = 0; i2 < parcelableArray.length; i2++) {
            this.aa[i2] = (alad) parcelableArray[i2];
        }
        parcelableArray = bundle.getParcelableArray("OPTIONAL_PERMISSIONS");
        this.ab = new alad[parcelableArray.length];
        while (i < parcelableArray.length) {
            this.ab[i] = (alad) parcelableArray[i];
            i++;
        }
        this.ac = acwl.a(bundle.getInt("PAGE_VE_TYPE"));
        this.ad = acwc.a(bundle.getString("ALLOW_ACCESS_BUTTON_VE_TYPE"));
        this.ae = acwc.a(bundle.getString("CANCEL_BUTTON_VE_TYPE"));
        this.af = acwc.a(bundle.getString("OPEN_APP_SETTING_BUTTON_VE_TYPE"));
        this.ag = bundle.getInt("ALLOW_ACCESS_DESCRIPTION_RES_ID");
        this.ah = bundle.getInt("OPEN_SETTING_DESCRIPTION_RES_ID");
        this.an = bundle.getInt("TITLE_RES_ID_KEY");
        this.am = true;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.a(this.ac, null, this.c);
        this.b.b(this.ae, this.c);
        this.ai = alao.b(p());
        return a(viewGroup, layoutInflater);
    }

    private final View a(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context context = this.Z;
        if (context != null) {
            layoutInflater = layoutInflater.cloneInContext(context);
        }
        View inflate = layoutInflater.inflate(R.layout.permission_request_fragment, viewGroup, false);
        ((Toolbar) inflate.findViewById(R.id.toolbar)).a(new alar(this));
        this.aj = (Button) inflate.findViewById(R.id.permission_request_button);
        this.aj.setOnClickListener(this);
        this.ak = (TextView) inflate.findViewById(R.id.permission_description);
        this.ak.setText(this.ag);
        if (this.an != 0) {
            ((TextView) inflate.findViewById(R.id.permission_title)).setText(this.an);
        }
        if (b(p(), this.aa)) {
            W();
        } else {
            this.b.b(this.ad, this.c);
        }
        return inflate;
    }

    private static SharedPreferences b(Activity activity) {
        www i = ((wwz) activity.getApplication()).i();
        if (i != null) {
            return i.ox();
        }
        return activity.getPreferences(0);
    }

    public static boolean a(Context context, alad[] aladArr) {
        for (alad alad : aladArr) {
            for (String checkSelfPermission : alai.a(alad.a)) {
                if (context.checkSelfPermission(checkSelfPermission) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(Activity activity, alad[] aladArr) {
        for (alad alad : aladArr) {
            if (alai.b(alao.b(activity), alai.a(alad.a))) {
                return true;
            }
        }
        return false;
    }

    private final void W() {
        this.b.b(this.af, this.c);
        this.ak.setText(this.ah);
        this.aj.setText(R.string.permission_open_settings_button);
        this.al = true;
    }

    public final void onClick(View view) {
        acwc acwc;
        if (this.al) {
            acwc = this.af;
            if (acwc != null) {
                this.b.a(3, new acvs(acwc), this.c);
            }
            alai.a(p());
            return;
        }
        acwc = this.ad;
        if (acwc != null) {
            this.b.a(3, new acvs(acwc), this.c);
        }
        X();
    }

    public final void f() {
        acwc acwc = this.ae;
        if (acwc != null) {
            this.b.a(3, new acvs(acwc), this.c);
        }
        alaq alaq = this.a;
        if (alaq != null) {
            alaq.W();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nn p = p();
        View view = this.K;
        if (p != null && view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            View a = a(viewGroup, (LayoutInflater) p.getSystemService("layout_inflater"));
            viewGroup.removeAllViews();
            viewGroup.addView(a);
        }
    }

    public final void a(int i, String[] strArr, int[] iArr) {
        Object obj;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            alad[] aladArr = this.aa;
            if (i3 >= aladArr.length) {
                i3 = 0;
                while (true) {
                    aladArr = this.ab;
                    if (i3 >= aladArr.length) {
                        obj = null;
                        break;
                    }
                    obj = aladArr[i3];
                    if (i == obj.a) {
                        break;
                    }
                    i3++;
                }
            } else {
                obj = aladArr[i3];
                if (i == obj.a) {
                    break;
                }
                i3++;
            }
        }
        amqw.a(obj);
        acwc acwc;
        if (alai.a(iArr)) {
            acwc = obj.b;
            if (acwc != null) {
                this.b.a(3, new acvs(acwc), this.c);
            }
            X();
            return;
        }
        while (true) {
            alad[] aladArr2 = this.aa;
            if (i2 >= aladArr2.length) {
                acwc = obj.c;
                if (acwc != null) {
                    this.b.a(3, new acvs(acwc), this.c);
                }
                alaq alaq = this.a;
                if (alaq != null) {
                    alaq.s_();
                }
            } else if (i != aladArr2[i2].a) {
                i2++;
            } else {
                acwc = obj.c;
                if (acwc != null) {
                    this.b.a(3, new acvs(acwc), this.c);
                }
                if (!this.al && b(p(), this.aa)) {
                    W();
                }
            }
        }
    }

    private final boolean b(Activity activity, alad[] aladArr) {
        ArrayList arrayList = new ArrayList();
        for (alad alad : aladArr) {
            arrayList.addAll(Arrays.asList(alai.a(alad.a)));
        }
        return alai.a(activity, this.ai, (String[]) arrayList.toArray(new String[0]));
    }

    private final void X() {
        alad[] aladArr;
        alad alad;
        Context p = p();
        int i = 0;
        int i2 = 0;
        while (true) {
            aladArr = this.aa;
            if (i2 >= aladArr.length) {
                alad = null;
                break;
            } else if (!alai.a(p, aladArr[i2].a)) {
                alad = this.aa[i2];
                break;
            } else {
                i2++;
            }
        }
        if (alad == null) {
            while (true) {
                aladArr = this.ab;
                if (i >= aladArr.length) {
                    break;
                } else if (!alai.a(p, aladArr[i].a)) {
                    alad = this.ab[i];
                    break;
                } else {
                    i++;
                }
            }
        }
        if (alad == null) {
            alaq alaq = this.a;
            if (alaq != null) {
                alaq.s_();
            }
            return;
        }
        this.b.b(alad.b, this.c);
        this.b.b(alad.c, this.c);
        String[] a = alai.a(alad.a);
        alai.a(this.ai, a);
        a(a, alad.a);
    }
}
