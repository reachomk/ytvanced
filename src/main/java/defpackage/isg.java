package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: isg */
public final class isg extends BaseAdapter {
    public final ArrayList a = new ArrayList();
    public final SparseIntArray b;
    public isl c;
    private final LayoutInflater d;
    private final Resources e;
    private final Context f;
    private final zyw g;
    private int h = 0;

    public isg(Context context, zyw zyw) {
        this.d = LayoutInflater.from(context);
        this.e = context.getResources();
        this.b = new SparseIntArray();
        this.f = context;
        this.g = zyw;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getViewTypeCount() {
        return 3;
    }

    public final Object getItem(int i) {
        return this.a.get(i);
    }

    public final int getCount() {
        return this.a.size();
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Object item = getItem(i);
        if (item instanceof abnv) {
            abnv abnv = (abnv) item;
            if (view == null) {
                view = this.d.inflate(R.layout.search_suggestion_entry, viewGroup, false);
            }
            isk isk = (isk) view.getTag(R.id.search_suggestions_tag);
            if (isk == null) {
                isk = new isk(this, view);
                isk.c.setOnClickListener(new isj(this, isk));
                view.setTag(R.id.search_suggestions_tag, isk);
            }
            isk.d = abnv;
            Spanned spanned = abnv.h;
            if (spanned != null) {
                SpannableString spannableString = new SpannableString(abnv.a);
                for (StyleSpan styleSpan : (StyleSpan[]) spanned.getSpans(0, spanned.length(), StyleSpan.class)) {
                    if (styleSpan.getStyle() == 1) {
                        isg isg = isk.e;
                        int i2 = isg.h;
                        if (i2 == 0) {
                            i2 = xwe.a(isg.f, R.attr.ytTextPrimary, 0);
                            isg.h = i2;
                        }
                        spannableString.setSpan(new ForegroundColorSpan(i2), spanned.getSpanStart(styleSpan), spanned.getSpanEnd(styleSpan), 33);
                    }
                }
                isk.b.setText(spannableString);
            } else {
                isk.b.setText(abnv.a);
            }
            isk.c.setContentDescription(isk.e.e.getString(R.string.accessibility_search_edit_suggestion, new Object[]{abnv.a}));
            int[] iArr = abnv.d;
            if (iArr != null) {
                for (int i3 : iArr) {
                    if (i3 == 143 || i3 == 179) {
                        isk.a.setImageResource(R.drawable.quantum_ic_trending_up_grey600_24);
                        isk.a.setVisibility(0);
                        break;
                    }
                }
            }
            if (abnv.a()) {
                isk.a.setImageResource(R.drawable.quantum_ic_history_grey600_24);
                isk.a.setVisibility(0);
            } else if (abnv.m == abnv.i) {
                isk.a.setVisibility(4);
                isk.a.setImageResource(0);
            } else {
                isk.a.setImageResource(R.drawable.quantum_ic_search_grey600_24);
                isk.a.setVisibility(0);
            }
            isg isg2 = isk.e;
            TextView textView = isk.b;
            textView.setPaddingRelative(xss.a(isg2.e.getDisplayMetrics(), !foh.y(isg2.g) ? 20 : 12), 0, textView.getPaddingEnd(), 0);
            return view;
        } else if (item instanceof ixl) {
            ixl ixl = (ixl) item;
            if (view == null) {
                view = this.d.inflate(R.layout.search_suggestion_category, viewGroup, false);
            }
            isi isi = (isi) view.getTag(R.id.search_category_tag);
            if (isi == null) {
                isi = new isi(view);
                view.setTag(R.id.search_category_tag, isi);
            }
            isi.a.setText(ixl.a);
            return view;
        } else if (item instanceof ixk) {
            return view == null ? this.d.inflate(R.layout.search_suggestion_divider, viewGroup, false) : view;
        } else {
            return null;
        }
    }

    public final int getItemViewType(int i) {
        Object item = getItem(i);
        if (item instanceof abnv) {
            return 0;
        }
        if (item instanceof ixl) {
            return 2;
        }
        if (item instanceof ixk) {
            return 1;
        }
        return 0;
    }

    public final boolean isEnabled(int i) {
        Object item = getItem(i);
        return ((item instanceof ixl) || (item instanceof ixk)) ? false : true;
    }
}
