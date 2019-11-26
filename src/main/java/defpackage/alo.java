package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: alo */
public final class alo implements alw, OnClickListener {
    private aeh a;
    private ListAdapter b;
    private CharSequence c;
    private final /* synthetic */ AppCompatSpinner d;

    public alo(AppCompatSpinner appCompatSpinner) {
        this.d = appCompatSpinner;
    }

    public final Drawable b() {
        return null;
    }

    public final int c() {
        return 0;
    }

    public final int f() {
        return 0;
    }

    public final void d() {
        aeh aeh = this.a;
        if (aeh != null) {
            aeh.dismiss();
            this.a = null;
        }
    }

    public final boolean e() {
        aeh aeh = this.a;
        return aeh != null ? aeh.isShowing() : false;
    }

    public final void a(ListAdapter listAdapter) {
        this.b = listAdapter;
    }

    public final void a(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final CharSequence a() {
        return this.c;
    }

    public final void a(int i, int i2) {
        if (this.b != null) {
            aeg aeg = new aeg(this.d.a);
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                aeg.a(charSequence);
            }
            ListAdapter listAdapter = this.b;
            int selectedItemPosition = this.d.getSelectedItemPosition();
            aeb aeb = aeg.a;
            aeb.n = listAdapter;
            aeb.o = this;
            aeb.t = selectedItemPosition;
            aeb.s = true;
            this.a = aeg.a();
            ListView listView = this.a.a.g;
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            this.a.show();
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.d.setSelection(i);
        if (this.d.getOnItemClickListener() != null) {
            this.d.performItemClick(null, i, this.b.getItemId(i));
        }
        d();
    }

    public final void a(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    public final void a(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    public final void b(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
