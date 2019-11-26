package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: alaf */
public final class alaf extends nf {
    public boolean Z;
    public SharedPreferences a;
    private CharSequence aa;
    private CharSequence ab;
    private TextView ac;
    private TextView ad;
    private ImageView ae;
    public alaj b;
    public String[] c;

    public static String[] a(Context context, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!xun.a(context, str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private static boolean b(Context context, String[] strArr) {
        return alaf.a(context, strArr).length == 0;
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((alag) xse.a(p())).a(this);
        bundle = this.j;
        this.c = (String[]) amqw.a(bundle.getStringArray("missing_permissions"));
        this.aa = bundle.getCharSequence("allow_access_description");
        this.ab = bundle.getCharSequence("open_settings_description");
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.permission_fragment, viewGroup, false);
        this.ac = (TextView) inflate.findViewById(R.id.permission_description);
        this.ac.setText(this.aa);
        this.ad = (TextView) inflate.findViewById(R.id.action_button);
        this.ad.setOnClickListener(new alae(this));
        this.ae = (ImageView) inflate.findViewById(R.id.close_button);
        this.ae.setOnClickListener(new alah(this));
        if (f()) {
            W();
        }
        return inflate;
    }

    public final void W_() {
        super.W_();
        if (this.Z && alaf.b(p(), this.c)) {
            alaj alaj = this.b;
            if (alaj != null) {
                alaj.a();
            }
        }
    }

    public final void a(int i, String[] strArr, int[] iArr) {
        if (strArr.length != 0 && iArr.length != 0) {
            Editor edit = this.a.edit();
            String str = "permissions_requested";
            HashSet hashSet = new HashSet(this.a.getStringSet(str, amwp.a));
            Collections.addAll(hashSet, strArr);
            edit.putStringSet(str, hashSet);
            edit.apply();
            if (f()) {
                W();
            }
            if (alaf.b(p(), this.c)) {
                alaj alaj = this.b;
                if (alaj != null) {
                    alaj.a();
                }
            }
        }
    }

    private final boolean f() {
        Set stringSet = this.a.getStringSet("permissions_requested", null);
        if (stringSet != null) {
            for (String str : this.c) {
                if (!xun.a(p(), str) && stringSet.contains(str) && !p().shouldShowRequestPermissionRationale(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void W() {
        this.ac.setText(this.ab);
        this.ad.setText(R.string.open_settings_button);
        this.Z = true;
    }
}
