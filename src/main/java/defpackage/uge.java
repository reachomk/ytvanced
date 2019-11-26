package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: uge */
public final class uge extends nf implements pu {
    public ugf a;
    private ArrayAdapter b;

    public final void a(Context context) {
        super.a(context);
        nf nfVar = this.y;
        if (nfVar instanceof ugf) {
            this.a = (ugf) nfVar;
            return;
        }
        nn p = p();
        if (p instanceof ugf) {
            this.a = (ugf) p;
        }
    }

    public final void J_() {
        super.J_();
        this.a = null;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.libraries_social_licenses_license_menu_fragment, viewGroup, false);
    }

    public final void a(View view, Bundle bundle) {
        af p = p();
        this.b = new ArrayAdapter(p, R.layout.libraries_social_licenses_license, R.id.license, new ArrayList());
        pv.a(p).a((pu) this);
        ListView listView = (ListView) view.findViewById(R.id.license_list);
        listView.setAdapter(this.b);
        listView.setOnItemClickListener(new ugg(this));
    }

    public final void X_() {
        super.X_();
        pv.a(p()).a();
    }

    public final void a() {
        this.b.clear();
        this.b.notifyDataSetChanged();
    }
}
