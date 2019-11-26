package defpackage;

import android.app.AlertDialog.Builder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import com.google.android.apps.youtube.app.settings.developer.DebugOnlineAdActivity;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;

/* renamed from: jcx */
public final class jcx extends ArrayAdapter implements OnClickListener, OnItemSelectedListener {
    private final int a = R.layout.custom_debug_ad_break;
    private boolean b;
    private final /* synthetic */ DebugOnlineAdActivity c;

    public jcx(DebugOnlineAdActivity debugOnlineAdActivity) {
        this.c = debugOnlineAdActivity;
        super(debugOnlineAdActivity.m, R.layout.custom_debug_ad_break, debugOnlineAdActivity.q);
        a(debugOnlineAdActivity.l.a());
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    private final void a(voh voh, EditText editText) {
        vol vol = voh.a;
        boolean z = vol == vol.GROUP_ID || vol == vol.URL || vol == vol.VIRAL_CAMPAIGN_ID || vol == vol.VIRAL_AD_RESPONSE || vol == vol.VIRAL_AD_RESPONSE_URL;
        amqw.b(z);
        xpr.a((View) editText, true);
        editText.setHint(vol.g);
        switch (vol.ordinal()) {
            case 18:
                editText.setText(voh.g);
                break;
            case 20:
                editText.setText(String.valueOf(voh.d));
                break;
            case 21:
                editText.setText(String.valueOf(voh.e));
                break;
            case 22:
                editText.setText(String.valueOf(voh.f));
                break;
            default:
                editText.setText(voh.h);
                break;
        }
        jde jde = new jde();
        jde.f = voh;
        editText.setTag(new WeakReference(jde));
        editText.setOnClickListener(this);
    }

    private final void b(voh voh, EditText editText) {
        amqw.b(voh.b == vsm.MID_ROLL);
        xpr.a((View) editText, true);
        editText.setHint("Time (ms)");
        editText.setText(voh.a());
        jde jde = new jde();
        jde.f = voh;
        editText.setTag(new WeakReference(jde));
        editText.setOnClickListener(this);
    }

    public final void onClick(View view) {
        if (view.getTag() instanceof WeakReference) {
            WeakReference weakReference = (WeakReference) view.getTag();
            if (weakReference.get() != null) {
                voh voh = ((jde) weakReference.get()).f;
                if (view instanceof EditText) {
                    EditText editText = (EditText) view;
                    String str = "Cancel";
                    String str2 = "OK";
                    EditText editText2;
                    Builder view2;
                    String a;
                    if (editText.getHint().toString().equals("Time (ms)")) {
                        editText2 = new EditText(this.c.m);
                        editText2.setInputType(2);
                        view2 = new Builder(this.c.m).setView(editText2);
                        a = voh.a();
                        editText2.setText(a);
                        view2.setPositiveButton(str2, new jdb(this, editText2, a, editText, voh)).setNegativeButton(str, new jdc());
                        view2.create().show();
                        return;
                    }
                    String str3;
                    editText2 = new EditText(this.c.m);
                    view2 = new Builder(this.c.m).setView(editText2);
                    switch (voh.a.ordinal()) {
                        case 18:
                            str3 = voh.g;
                            break;
                        case 20:
                            str3 = String.valueOf(voh.d);
                            break;
                        case 21:
                            str3 = String.valueOf(voh.e);
                            break;
                        case 22:
                            str3 = String.valueOf(voh.f);
                            break;
                        default:
                            str3 = voh.h;
                            break;
                    }
                    a = str3;
                    editText2.setText(a);
                    view2.setPositiveButton(str2, new jcz(this, editText2, a, voh, editText)).setNegativeButton(str, new jda());
                    view2.create().show();
                } else if (view instanceof ImageView) {
                    remove(voh);
                    notifyDataSetChanged();
                }
            }
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (adapterView.getTag() instanceof WeakReference) {
            jde jde = (jde) ((WeakReference) adapterView.getTag()).get();
            if (jde != null) {
                voh voh = jde.f;
                if (adapterView.getItemAtPosition(i) instanceof vol) {
                    vol vol = (vol) adapterView.getItemAtPosition(i);
                    if (voh.a != vol) {
                        view = jde.d;
                        voh.a = vol;
                        switch (vol.ordinal()) {
                            case 18:
                                voh.j = false;
                                voh.i = true;
                                a(voh, view);
                                break;
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                voh.j = false;
                                voh.i = false;
                                a(voh, view);
                                break;
                            default:
                                voh.j = true;
                                voh.i = false;
                                xpr.a(view, false);
                                break;
                        }
                        notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                vsm vsm = (vsm) adapterView.getItemAtPosition(i);
                if (voh.b != vsm) {
                    view = jde.b;
                    voh.b = vsm;
                    if (vsm == vsm.MID_ROLL) {
                        b(voh, view);
                    } else {
                        xpr.a(view, false);
                    }
                    notifyDataSetChanged();
                }
            }
        }
    }

    public final boolean isEnabled(int i) {
        return this.b;
    }

    public final void a(boolean z) {
        this.b = z;
        notifyDataSetChanged();
    }

    public final void notifyDataSetChanged() {
        this.c.l.b(getCount() != 0);
        DebugOnlineAdActivity debugOnlineAdActivity = this.c;
        debugOnlineAdActivity.l.a(debugOnlineAdActivity.q);
        this.c.p.setEnabled(this.b);
        debugOnlineAdActivity = this.c;
        debugOnlineAdActivity.p.setChecked(debugOnlineAdActivity.l.a.getBoolean("debugAdEnableFreqCap", true) ^ 1);
        super.notifyDataSetChanged();
        this.c.n();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        jde jde;
        View inflate;
        if (view == null) {
            jde = new jde();
            inflate = LayoutInflater.from(this.c.m).inflate(this.a, viewGroup, false);
            jde.a = (Spinner) inflate.findViewById(R.id.position);
            jde.b = (EditText) inflate.findViewById(R.id.position_entry);
            jde.c = (Spinner) inflate.findViewById(R.id.ad);
            jde.d = (EditText) inflate.findViewById(R.id.ad_entry);
            jde.e = (ImageView) inflate.findViewById(R.id.delete);
            inflate.setTag(jde);
        } else {
            inflate = view;
            jde = (jde) view.getTag();
        }
        Spinner spinner = jde.a;
        View view2 = jde.b;
        voh voh = (voh) getItem(i);
        spinner.setAdapter(new ArrayAdapter(this.c.m, R.layout.spinner_item, vsm.values()));
        spinner.setSelection(voh.b.ordinal());
        spinner.setEnabled(this.b);
        if (voh.b == vsm.MID_ROLL) {
            b(voh, view2);
        } else {
            xpr.a(view2, false);
        }
        view2.setEnabled(this.b);
        jde jde2 = new jde();
        jde2.b = view2;
        jde2.f = (voh) getItem(i);
        spinner.setTag(new WeakReference(jde2));
        spinner.setOnItemSelectedListener(this);
        spinner = jde.c;
        view2 = jde.d;
        voh = (voh) getItem(i);
        spinner.setAdapter(new ArrayAdapter(this.c.m, R.layout.spinner_item, vol.values()));
        spinner.setSelection(voh.a.ordinal());
        spinner.setEnabled(this.b);
        if (voh.a == vol.GROUP_ID || voh.a == vol.URL || voh.a == vol.VIRAL_CAMPAIGN_ID || voh.a == vol.VIRAL_AD_RESPONSE || voh.a == vol.VIRAL_AD_RESPONSE_URL) {
            a(voh, view2);
        } else {
            xpr.a(view2, false);
        }
        view2.setEnabled(this.b);
        jde jde3 = new jde();
        jde3.d = view2;
        jde3.f = (voh) getItem(i);
        spinner.setTag(new WeakReference(jde3));
        spinner.setOnItemSelectedListener(this);
        ImageView imageView = jde.e;
        imageView.setEnabled(this.b);
        jde3 = new jde();
        jde3.f = (voh) getItem(i);
        imageView.setTag(new WeakReference(jde3));
        imageView.setOnClickListener(this);
        return inflate;
    }
}
