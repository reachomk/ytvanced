package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.google.android.libraries.youtube.offline.ui.NonScrollableListView;
import com.google.android.youtube.R;

/* renamed from: ahbz */
public final class ahbz {
    public final Activity a;
    public final aaas b;
    public final agvs c;
    public final ImageView d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final AlertDialog i;
    public final TextView j;
    public final akyy k;
    public final akyy l;
    public aphg m;
    public aphg n;
    public acvx o;
    public final NonScrollableListView p;
    public final ahbw q;
    private final akkq r;

    public final void a(ImageView imageView, aygk aygk) {
        if (aygk != null) {
            this.r.a(imageView, aygk, akko.h);
            imageView.setVisibility(0);
            return;
        }
        imageView.setVisibility(8);
    }

    public /* synthetic */ ahbz(Activity activity, aaas aaas, agvs agvs, akkq akkq, akzb akzb) {
        this.a = activity;
        this.b = aaas;
        this.c = agvs;
        this.r = akkq;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.upsell_dialog_with_header_images, null);
        this.p = (NonScrollableListView) inflate.findViewById(R.id.offline_stream_selection_list);
        this.q = new ahbw(activity, this.p);
        NonScrollableListView nonScrollableListView = this.p;
        Object obj = this.q;
        ListAdapter listAdapter = nonScrollableListView.a;
        if (listAdapter != null) {
            listAdapter.unregisterDataSetObserver(nonScrollableListView.c);
        }
        nonScrollableListView.a = (ListAdapter) amqw.a(obj);
        nonScrollableListView.a();
        if (nonScrollableListView.c == null) {
            nonScrollableListView.c = new ahbs(nonScrollableListView);
        }
        obj.registerDataSetObserver(nonScrollableListView.c);
        this.d = (ImageView) inflate.findViewById(R.id.background_image);
        this.e = (ImageView) inflate.findViewById(R.id.logo);
        this.f = (TextView) inflate.findViewById(R.id.dialog_title);
        this.g = (TextView) inflate.findViewById(R.id.dialog_subtitle);
        this.h = (TextView) inflate.findViewById(R.id.dialog_message);
        this.j = (TextView) inflate.findViewById(R.id.dismiss_button);
        this.l = akzb.a(this.j);
        this.k = akzb.a((TextView) inflate.findViewById(R.id.action_button));
        this.i = new Builder(activity).setView(inflate).create();
        this.i.setOnCancelListener(new ahby(this));
        ahcb ahcb = new ahcb(this);
        this.l.c = ahcb;
        this.k.c = ahcb;
    }
}
