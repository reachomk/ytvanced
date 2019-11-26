package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SortFilterSubMenuRendererOuterClass;
import java.util.Arrays;

/* renamed from: abxb */
public final class abxb implements abxi, OnItemSelectedListener {
    public final Context a;
    public final ExpandingScrollView b;
    public final ImageView c;
    public final abri d;
    public final TypedValue e = new TypedValue();
    public final TypedValue f = new TypedValue();
    public final abru g;
    public final abrf h;
    public int i;
    private final TextView j;
    private final Spinner k;
    private absa l;

    public abxb(Context context, abwl abwl, abru abru, abrf abrf, View view) {
        this.a = context;
        this.g = abru;
        this.h = abrf;
        this.j = (TextView) view.findViewById(R.id.live_chat_label);
        this.k = (Spinner) view.findViewById(R.id.live_chat_view_selector);
        this.b = (ExpandingScrollView) view.findViewById(R.id.live_chat);
        ExpandingScrollView expandingScrollView = this.b;
        ugr ugr = ExpandingScrollView.a;
        ugr ugr2 = ExpandingScrollView.a;
        expandingScrollView.b = ugr;
        expandingScrollView.c = ugr2;
        expandingScrollView.a(expandingScrollView.getContext().getResources().getConfiguration());
        expandingScrollView.e = null;
        expandingScrollView.f = null;
        this.b.a(ugo.COLLAPSED, false);
        this.b.a(ugo.EXPANDED, 100.0f);
        this.b.a(ugo.COLLAPSED, 0.0f);
        expandingScrollView = this.b;
        expandingScrollView.h.add(new abxc(this));
        ugo ugo = expandingScrollView.g;
        expandingScrollView.a(Arrays.asList(new ugp[]{r7}));
        this.b.addOnLayoutChangeListener(new abxa(this));
        this.c = (ImageView) view.findViewById(R.id.live_chat_expand_button);
        view.findViewById(R.id.live_chat_header).setOnClickListener(new abxf(this));
        this.d = abwl.a(view, false);
        Resources resources = context.getResources();
        resources.getValue(R.drawable.expand_live_chat_drawer_icon, this.e, true);
        resources.getValue(R.drawable.collapse_live_chat_drawer_icon, this.f, true);
    }

    public final void a(boolean z) {
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void a(aufo aufo) {
        if (aufo != null && aufo.a == 130028801) {
            audb audb = (audb) aufo.b;
            boolean z = true;
            Spanned a = ajqy.a(audb.a == 1 ? (arml) audb.b : null);
            if (!TextUtils.isEmpty(a)) {
                this.j.setText(a);
                this.l = null;
            } else if (audb.a == 5) {
                axak axak = (axak) audb.b;
                anxr access$000 = anxl.checkIsLite(SortFilterSubMenuRendererOuterClass.sortFilterSubMenuRenderer);
                axak.a(access$000);
                Object b = axak.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                axqn axqn = (axqn) b;
                if (axqn.b.size() != 0) {
                    this.l = new absa(this.a, this.g, axqn.b);
                    this.k.setAdapter(this.l);
                    this.k.setOnItemSelectedListener(this);
                }
            }
            if (!(this.b.d == ugo.FULLY_EXPANDED || this.b.d == ugo.EXPANDED)) {
                z = false;
            }
            b(z);
        }
    }

    public final void b(boolean z) {
        absa absa = this.l;
        if (absa == null) {
            this.j.setVisibility(0);
            this.k.setVisibility(8);
        } else if (z) {
            this.k.setVisibility(0);
            this.j.setVisibility(8);
        } else {
            axql axql = (axql) absa.getItem(this.k.getSelectedItemPosition());
            this.k.setVisibility(8);
            this.j.setVisibility(0);
            this.j.setText(axql.d);
        }
    }

    public final void a(int i) {
        ViewParent parent = this.b.getParent();
        if (xrn.c(this.a) && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != this.b) {
                    abe.b(childAt, i);
                }
            }
        }
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i != 0) {
            absa absa = this.l;
            if (absa != null) {
                axql axql = (axql) absa.a.remove(i);
                absa.a.add(0, axql);
                this.k.setSelection(0);
                if (axql.b == 3) {
                    Object obj = ((axqp) axql.c).b;
                    if (obj == null) {
                        obj = awzv.d;
                    }
                    ajtj.a(obj);
                }
            }
        }
    }
}
