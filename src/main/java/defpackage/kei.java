package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kei */
public final class kei extends akpl {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.title));
    private final TextView c = ((TextView) this.a.findViewById(R.id.subtitle));
    private final akou d;
    private final Resources e;
    private final Context f;

    public kei(Context context, flu flu) {
        amqw.a((Object) context);
        this.d = (akou) amqw.a((Object) flu);
        this.a = View.inflate(context, R.layout.item_section_header, null);
        this.f = context;
        this.e = context.getResources();
        flu.a(this.a);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.d.a();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        atvp atvp = (atvp) obj;
        TextView textView = this.b;
        arml arml2 = null;
        if ((atvp.a & 1) != 0) {
            arml = atvp.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.c;
        if ((atvp.a & 4) != 0) {
            arml2 = atvp.d;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        xpr.a(textView, ajqy.a(arml2));
        this.d.a(akor);
        int a = atvf.a(atvp.c);
        if (a == 0) {
            a = 1;
        }
        if (a == 2 || a == 3) {
            adl.a(this.b, (int) R.style.f463TextAppearance.YouTube.Body1);
            adl.a(this.c, (int) R.style.f468TextAppearance.YouTube.Caption);
        } else if (a == 4) {
            adl.a(this.b, (int) R.style.f485TextAppearance.YouTube.Subhead);
            adl.a(this.c, (int) R.style.f463TextAppearance.YouTube.Body1);
            this.c.setTextColor(xwe.a(this.f, R.attr.ytTextSecondary, 0));
        } else if (a == 6) {
            adl.a(this.b, (int) R.style.f478TextAppearance.YouTube.Spec.Body2b);
            this.b.setTextColor(xwe.a(this.f, R.attr.ytTextSecondary, 0));
        } else if (a == 5) {
            adl.a(this.b, (int) R.style.f485TextAppearance.YouTube.Subhead);
            this.b.setTextColor(xwe.a(this.f, R.attr.ytTextPrimary, 0));
            this.b.setTypeface(ajrc.ROBOTO_MEDIUM.a(this.f));
        } else {
            adl.a(this.b, (int) R.style.f465TextAppearance.YouTube.Body2);
            adl.a(this.c, (int) R.style.f468TextAppearance.YouTube.Caption);
        }
        View view = this.a;
        int dimensionPixelSize = a == 2 ? this.e.getDimensionPixelSize(R.dimen.item_section_list_header_mysubs_min_height) : a == 3 ? this.e.getDimensionPixelSize(R.dimen.item_section_list_header_notifications_shelf_min_height) : a == 4 ? this.e.getDimensionPixelSize(R.dimen.item_section_list_header_search_min_height) : a == 6 ? this.e.getDimensionPixelSize(R.dimen.item_section_list_header_history_min_height) : this.e.getDimensionPixelSize(R.dimen.item_section_list_header_min_height);
        view.setMinimumHeight(dimensionPixelSize);
        view = this.a;
        dimensionPixelSize = view.getPaddingLeft();
        int dimensionPixelSize2 = a == 2 ? this.e.getDimensionPixelSize(R.dimen.item_section_list_header_mysubs_top_padding) : a == 3 ? this.e.getDimensionPixelSize(R.dimen.item_section_list_header_notifications_shelf_top_padding) : a == 4 ? this.e.getDimensionPixelSize(R.dimen.item_section_list_header_search_top_padding) : a == 6 ? this.e.getDimensionPixelSize(R.dimen.item_section_list_header_history_top_padding) : this.e.getDimensionPixelSize(R.dimen.item_section_list_header_top_padding);
        int paddingRight = this.a.getPaddingRight();
        if (a == 2) {
            a = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_mysubs_bottom_padding);
        } else if (a == 3) {
            a = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_notifications_shelf_bottom_padding);
        } else if (a == 4) {
            a = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_search_bottom_padding);
        } else if (a == 6) {
            a = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_history_bottom_padding);
        } else {
            a = this.e.getDimensionPixelSize(R.dimen.item_section_list_header_bottom_padding);
        }
        view.setPadding(dimensionPixelSize, dimensionPixelSize2, paddingRight, a);
    }
}
