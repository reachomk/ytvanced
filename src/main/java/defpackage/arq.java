package defpackage;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.WeakHashMap;

/* renamed from: arq */
public final class arq extends avk implements OnClickListener {
    public int a = 1;
    private final SearchView k;
    private final SearchableInfo l;
    private final Context m;
    private final WeakHashMap n;
    private final int o;
    private ColorStateList p;
    private int q = -1;
    private int r = -1;
    private int s = -1;
    private int t = -1;
    private int u = -1;
    private int v = -1;

    public arq(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout());
        this.e.getSystemService("search");
        this.k = searchView;
        this.l = searchableInfo;
        this.o = searchView.getSuggestionCommitIconResId();
        this.m = context;
        this.n = weakHashMap;
    }

    public final boolean hasStableIds() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077 A:{Catch:{ RuntimeException -> 0x007b }} */
    public final android.database.Cursor a(java.lang.CharSequence r12) {
        /*
        r11 = this;
        r0 = "50";
        r1 = "";
        if (r12 == 0) goto L_0x000b;
    L_0x0006:
        r12 = r12.toString();
        goto L_0x000c;
    L_0x000b:
        r12 = r1;
    L_0x000c:
        r2 = r11.k;
        r2 = r2.getVisibility();
        r3 = 0;
        if (r2 != 0) goto L_0x0083;
    L_0x0015:
        r2 = r11.k;
        r2 = r2.getWindowVisibility();
        if (r2 != 0) goto L_0x0083;
    L_0x001d:
        r2 = r11.l;	 Catch:{ RuntimeException -> 0x007b }
        if (r2 == 0) goto L_0x0074;
    L_0x0021:
        r4 = r2.getSuggestAuthority();	 Catch:{ RuntimeException -> 0x007b }
        if (r4 == 0) goto L_0x0074;
    L_0x0027:
        r5 = new android.net.Uri$Builder;	 Catch:{ RuntimeException -> 0x007b }
        r5.<init>();	 Catch:{ RuntimeException -> 0x007b }
        r6 = "content";
        r5 = r5.scheme(r6);	 Catch:{ RuntimeException -> 0x007b }
        r4 = r5.authority(r4);	 Catch:{ RuntimeException -> 0x007b }
        r4 = r4.query(r1);	 Catch:{ RuntimeException -> 0x007b }
        r1 = r4.fragment(r1);	 Catch:{ RuntimeException -> 0x007b }
        r4 = r2.getSuggestPath();	 Catch:{ RuntimeException -> 0x007b }
        if (r4 == 0) goto L_0x0047;
    L_0x0044:
        r1.appendEncodedPath(r4);	 Catch:{ RuntimeException -> 0x007b }
    L_0x0047:
        r4 = "search_suggest_query";
        r1.appendPath(r4);	 Catch:{ RuntimeException -> 0x007b }
        r8 = r2.getSuggestSelection();	 Catch:{ RuntimeException -> 0x007b }
        if (r8 == 0) goto L_0x005a;
    L_0x0052:
        r2 = 1;
        r2 = new java.lang.String[r2];	 Catch:{ RuntimeException -> 0x007b }
        r4 = 0;
        r2[r4] = r12;	 Catch:{ RuntimeException -> 0x007b }
        r9 = r2;
        goto L_0x005e;
    L_0x005a:
        r1.appendPath(r12);	 Catch:{ RuntimeException -> 0x007b }
        r9 = r3;
    L_0x005e:
        r12 = "limit";
        r1.appendQueryParameter(r12, r0);	 Catch:{ RuntimeException -> 0x007b }
        r6 = r1.build();	 Catch:{ RuntimeException -> 0x007b }
        r12 = r11.e;	 Catch:{ RuntimeException -> 0x007b }
        r5 = r12.getContentResolver();	 Catch:{ RuntimeException -> 0x007b }
        r7 = 0;
        r10 = 0;
        r12 = r5.query(r6, r7, r8, r9, r10);	 Catch:{ RuntimeException -> 0x007b }
        goto L_0x0075;
    L_0x0074:
        r12 = r3;
    L_0x0075:
        if (r12 == 0) goto L_0x0083;
    L_0x0077:
        r12.getCount();	 Catch:{ RuntimeException -> 0x007b }
        return r12;
    L_0x007b:
        r12 = move-exception;
        r0 = "SuggestionsAdapter";
        r1 = "Search suggestions query threw an exception.";
        android.util.Log.w(r0, r1, r12);
    L_0x0083:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arq.a(java.lang.CharSequence):android.database.Cursor");
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        arq.c(this.d);
    }

    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        arq.c(this.d);
    }

    private static void c(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    public final void a(Cursor cursor) {
        try {
            Cursor cursor2 = this.d;
            if (cursor == cursor2) {
                cursor2 = null;
            } else {
                avg avg;
                DataSetObserver dataSetObserver;
                if (cursor2 != null) {
                    avg = this.g;
                    if (avg != null) {
                        cursor2.unregisterContentObserver(avg);
                    }
                    dataSetObserver = this.h;
                    if (dataSetObserver != null) {
                        cursor2.unregisterDataSetObserver(dataSetObserver);
                    }
                }
                this.d = cursor;
                if (cursor != null) {
                    avg = this.g;
                    if (avg != null) {
                        cursor.registerContentObserver(avg);
                    }
                    dataSetObserver = this.h;
                    if (dataSetObserver != null) {
                        cursor.registerDataSetObserver(dataSetObserver);
                    }
                    this.f = cursor.getColumnIndexOrThrow("_id");
                    this.b = true;
                    notifyDataSetChanged();
                } else {
                    this.f = -1;
                    this.b = false;
                    notifyDataSetInvalidated();
                }
            }
            if (cursor2 != null) {
                cursor2.close();
            }
            if (cursor != null) {
                this.q = cursor.getColumnIndex("suggest_text_1");
                this.r = cursor.getColumnIndex("suggest_text_2");
                this.s = cursor.getColumnIndex("suggest_text_2_url");
                this.t = cursor.getColumnIndex("suggest_icon_1");
                this.u = cursor.getColumnIndex("suggest_icon_2");
                this.v = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    public final View a(ViewGroup viewGroup) {
        View inflate = this.j.inflate(this.i, viewGroup, false);
        inflate.setTag(new ars(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.o);
        return inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0130  */
    public final void a(android.view.View r19, android.database.Cursor r20) {
        /*
        r18 = this;
        r1 = r18;
        r2 = r20;
        r3 = "SuggestionsAdapter";
        r0 = r19.getTag();
        r4 = r0;
        r4 = (defpackage.ars) r4;
        r0 = r1.v;
        r5 = -1;
        r6 = 0;
        if (r0 == r5) goto L_0x0019;
    L_0x0013:
        r0 = r2.getInt(r0);
        r7 = r0;
        goto L_0x001a;
    L_0x0019:
        r7 = 0;
    L_0x001a:
        r0 = r4.a;
        if (r0 == 0) goto L_0x0029;
    L_0x001e:
        r0 = r1.q;
        r0 = defpackage.arq.a(r2, r0);
        r8 = r4.a;
        defpackage.arq.a(r8, r0);
    L_0x0029:
        r0 = r4.b;
        r8 = 2;
        r9 = 1;
        if (r0 == 0) goto L_0x00a6;
    L_0x002f:
        r0 = r1.s;
        r0 = defpackage.arq.a(r2, r0);
        if (r0 != 0) goto L_0x003e;
    L_0x0037:
        r0 = r1.r;
        r0 = defpackage.arq.a(r2, r0);
        goto L_0x0082;
    L_0x003e:
        r10 = r1.p;
        if (r10 != 0) goto L_0x0061;
    L_0x0042:
        r10 = new android.util.TypedValue;
        r10.<init>();
        r11 = r1.e;
        r11 = r11.getTheme();
        r12 = 2130772496; // 0x7f010210 float:1.7148112E38 double:1.0527414894E-314;
        r11.resolveAttribute(r12, r10, r9);
        r11 = r1.e;
        r11 = r11.getResources();
        r10 = r10.resourceId;
        r10 = r11.getColorStateList(r10);
        r1.p = r10;
    L_0x0061:
        r10 = new android.text.SpannableString;
        r10.<init>(r0);
        r15 = new android.text.style.TextAppearanceSpan;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r11 = r1.p;
        r16 = 0;
        r17 = r11;
        r11 = r15;
        r5 = r15;
        r15 = r17;
        r11.<init>(r12, r13, r14, r15, r16);
        r0 = r0.length();
        r11 = 33;
        r10.setSpan(r5, r6, r0, r11);
        r0 = r10;
    L_0x0082:
        r5 = android.text.TextUtils.isEmpty(r0);
        if (r5 == 0) goto L_0x0095;
    L_0x0088:
        r5 = r4.a;
        if (r5 == 0) goto L_0x00a1;
    L_0x008c:
        r5.setSingleLine(r6);
        r5 = r4.a;
        r5.setMaxLines(r8);
        goto L_0x00a1;
    L_0x0095:
        r5 = r4.a;
        if (r5 == 0) goto L_0x00a1;
    L_0x0099:
        r5.setSingleLine(r9);
        r5 = r4.a;
        r5.setMaxLines(r9);
    L_0x00a1:
        r5 = r4.b;
        defpackage.arq.a(r5, r0);
    L_0x00a6:
        r5 = r4.c;
        r10 = 0;
        if (r5 != 0) goto L_0x00ad;
    L_0x00ab:
        goto L_0x014e;
    L_0x00ad:
        r0 = r1.t;
        r11 = -1;
        if (r0 == r11) goto L_0x0149;
    L_0x00b2:
        r0 = r2.getString(r0);
        r0 = r1.a(r0);
        if (r0 != 0) goto L_0x014a;
    L_0x00bc:
        r0 = r1.l;
        r0 = r0.getSearchActivity();
        r11 = r0.flattenToShortString();
        r12 = r1.n;
        r12 = r12.containsKey(r11);
        if (r12 == 0) goto L_0x00e5;
    L_0x00ce:
        r0 = r1.n;
        r0 = r0.get(r11);
        r0 = (android.graphics.drawable.Drawable.ConstantState) r0;
        if (r0 == 0) goto L_0x00e3;
    L_0x00d8:
        r3 = r1.m;
        r3 = r3.getResources();
        r0 = r0.newDrawable(r3);
        goto L_0x013c;
    L_0x00e3:
        r0 = r10;
        goto L_0x013c;
    L_0x00e5:
        r12 = r1.e;
        r12 = r12.getPackageManager();
        r13 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r13 = r12.getActivityInfo(r0, r13);	 Catch:{ NameNotFoundException -> 0x0124 }
        r14 = r13.getIconResource();
        if (r14 == 0) goto L_0x012d;
    L_0x00f7:
        r15 = r0.getPackageName();
        r13 = r13.applicationInfo;
        r12 = r12.getDrawable(r15, r14, r13);
        if (r12 != 0) goto L_0x012e;
    L_0x0103:
        r12 = new java.lang.StringBuilder;
        r12.<init>();
        r13 = "Invalid icon resource ";
        r12.append(r13);
        r12.append(r14);
        r13 = " for ";
        r12.append(r13);
        r0 = r0.flattenToShortString();
        r12.append(r0);
        r0 = r12.toString();
        android.util.Log.w(r3, r0);
        goto L_0x012d;
    L_0x0124:
        r0 = move-exception;
        r12 = r0;
        r0 = r12.toString();
        android.util.Log.w(r3, r0);
    L_0x012d:
        r12 = r10;
    L_0x012e:
        if (r12 == 0) goto L_0x0135;
    L_0x0130:
        r0 = r12.getConstantState();
        goto L_0x0136;
    L_0x0135:
        r0 = r10;
    L_0x0136:
        r3 = r1.n;
        r3.put(r11, r0);
        r0 = r12;
    L_0x013c:
        if (r0 != 0) goto L_0x014a;
    L_0x013e:
        r0 = r1.e;
        r0 = r0.getPackageManager();
        r0 = r0.getDefaultActivityIcon();
        goto L_0x014a;
    L_0x0149:
        r0 = r10;
    L_0x014a:
        r3 = 4;
        defpackage.arq.a(r5, r0, r3);
    L_0x014e:
        r0 = r4.d;
        r3 = 8;
        if (r0 != 0) goto L_0x0155;
    L_0x0154:
        goto L_0x0165;
    L_0x0155:
        r5 = r1.u;
        r11 = -1;
        if (r5 == r11) goto L_0x0162;
    L_0x015a:
        r2 = r2.getString(r5);
        r10 = r1.a(r2);
    L_0x0162:
        defpackage.arq.a(r0, r10, r3);
    L_0x0165:
        r0 = r1.a;
        if (r0 != r8) goto L_0x016a;
    L_0x0169:
        goto L_0x0171;
    L_0x016a:
        if (r0 == r9) goto L_0x016d;
    L_0x016c:
        goto L_0x0187;
    L_0x016d:
        r0 = r7 & 1;
        if (r0 == 0) goto L_0x0187;
    L_0x0171:
        r0 = r4.e;
        r0.setVisibility(r6);
        r0 = r4.e;
        r2 = r4.a;
        r2 = r2.getText();
        r0.setTag(r2);
        r0 = r4.e;
        r0.setOnClickListener(r1);
        return;
    L_0x0187:
        r0 = r4.e;
        r0.setVisibility(r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arq.a(android.view.View, android.database.Cursor):void");
    }

    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.k.onQueryRefine((CharSequence) tag);
        }
    }

    private static void a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private static void a(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final CharSequence b(Cursor cursor) {
        if (cursor == null) {
            return null;
        }
        String a = arq.a(cursor, "suggest_intent_query");
        if (a != null) {
            return a;
        }
        if (this.l.shouldRewriteQueryFromData()) {
            a = arq.a(cursor, "suggest_intent_data");
            if (a != null) {
                return a;
            }
        }
        if (this.l.shouldRewriteQueryFromText()) {
            String a2 = arq.a(cursor, "suggest_text_1");
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            if (!this.b) {
                throw new IllegalStateException("this should only be called when the cursor is valid");
            } else if (this.d.moveToPosition(i)) {
                if (view == null) {
                    view = a(viewGroup);
                }
                a(view, this.d);
                return view;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("couldn't move cursor to position ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            }
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            view = a(viewGroup);
            if (view != null) {
                ((ars) view.getTag()).a.setText(e.toString());
            }
            return view;
        }
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            if (this.b) {
                this.d.moveToPosition(i);
                if (view == null) {
                    view = b(viewGroup);
                }
                a(view, this.d);
            } else {
                view = null;
            }
            return view;
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            view = b(viewGroup);
            if (view != null) {
                ((ars) view.getTag()).a.setText(e.toString());
            }
            return view;
        }
    }

    private final Drawable a(String str) {
        Drawable drawable = null;
        if (!(str == null || str.isEmpty() || "0".equals(str))) {
            try {
                int parseInt = Integer.parseInt(str);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("android.resource://");
                stringBuilder.append(this.m.getPackageName());
                stringBuilder.append("/");
                stringBuilder.append(parseInt);
                String stringBuilder2 = stringBuilder.toString();
                Drawable b = b(stringBuilder2);
                if (b != null) {
                    return b;
                }
                Drawable a = ra.a(this.m, parseInt);
                a(stringBuilder2, a);
                return a;
            } catch (NumberFormatException unused) {
                drawable = b(str);
                if (drawable == null) {
                    drawable = a(Uri.parse(str));
                    a(str, drawable);
                }
            } catch (NotFoundException unused2) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Icon resource not found: ");
                stringBuilder3.append(str);
                Log.w("SuggestionsAdapter", stringBuilder3.toString());
                return null;
            }
        }
        return drawable;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0096 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x013a */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:34|35|36|37|38) */
    private final android.graphics.drawable.Drawable a(android.net.Uri r10) {
        /*
        r9 = this;
        r0 = "Error closing icon stream for ";
        r1 = "SuggestionsAdapter";
        r2 = 0;
        r3 = r10.getScheme();	 Catch:{ FileNotFoundException -> 0x0151 }
        r4 = "android.resource";
        r3 = r4.equals(r3);	 Catch:{ FileNotFoundException -> 0x0151 }
        if (r3 != 0) goto L_0x0069;
    L_0x0011:
        r3 = r9.m;	 Catch:{ FileNotFoundException -> 0x0151 }
        r3 = r3.getContentResolver();	 Catch:{ FileNotFoundException -> 0x0151 }
        r3 = r3.openInputStream(r10);	 Catch:{ FileNotFoundException -> 0x0151 }
        if (r3 == 0) goto L_0x0052;
    L_0x001d:
        r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2);	 Catch:{ all -> 0x0039 }
        r3.close();	 Catch:{ IOException -> 0x0025 }
        goto L_0x0038;
    L_0x0025:
        r3 = move-exception;
        r5 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0151 }
        r5.<init>();	 Catch:{ FileNotFoundException -> 0x0151 }
        r5.append(r0);	 Catch:{ FileNotFoundException -> 0x0151 }
        r5.append(r10);	 Catch:{ FileNotFoundException -> 0x0151 }
        r0 = r5.toString();	 Catch:{ FileNotFoundException -> 0x0151 }
        android.util.Log.e(r1, r0, r3);	 Catch:{ FileNotFoundException -> 0x0151 }
    L_0x0038:
        return r4;
    L_0x0039:
        r4 = move-exception;
        r3.close();	 Catch:{ IOException -> 0x003e }
        goto L_0x0051;
    L_0x003e:
        r3 = move-exception;
        r5 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0151 }
        r5.<init>();	 Catch:{ FileNotFoundException -> 0x0151 }
        r5.append(r0);	 Catch:{ FileNotFoundException -> 0x0151 }
        r5.append(r10);	 Catch:{ FileNotFoundException -> 0x0151 }
        r0 = r5.toString();	 Catch:{ FileNotFoundException -> 0x0151 }
        android.util.Log.e(r1, r0, r3);	 Catch:{ FileNotFoundException -> 0x0151 }
    L_0x0051:
        throw r4;	 Catch:{ FileNotFoundException -> 0x0151 }
    L_0x0052:
        r0 = new java.io.FileNotFoundException;	 Catch:{ FileNotFoundException -> 0x0151 }
        r3 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0151 }
        r3.<init>();	 Catch:{ FileNotFoundException -> 0x0151 }
        r4 = "Failed to open ";
        r3.append(r4);	 Catch:{ FileNotFoundException -> 0x0151 }
        r3.append(r10);	 Catch:{ FileNotFoundException -> 0x0151 }
        r3 = r3.toString();	 Catch:{ FileNotFoundException -> 0x0151 }
        r0.<init>(r3);	 Catch:{ FileNotFoundException -> 0x0151 }
        throw r0;	 Catch:{ FileNotFoundException -> 0x0151 }
    L_0x0069:
        r0 = r10.getAuthority();	 Catch:{ NotFoundException -> 0x013a }
        r3 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NotFoundException -> 0x013a }
        if (r3 != 0) goto L_0x0123;
    L_0x0073:
        r3 = r9.e;	 Catch:{ NameNotFoundException -> 0x010c }
        r3 = r3.getPackageManager();	 Catch:{ NameNotFoundException -> 0x010c }
        r3 = r3.getResourcesForApplication(r0);	 Catch:{ NameNotFoundException -> 0x010c }
        r4 = r10.getPathSegments();	 Catch:{ NotFoundException -> 0x013a }
        if (r4 == 0) goto L_0x00f5;
    L_0x0083:
        r5 = r4.size();	 Catch:{ NotFoundException -> 0x013a }
        r6 = 0;
        r7 = 1;
        if (r5 != r7) goto L_0x00ad;
    L_0x008b:
        r0 = r4.get(r6);	 Catch:{ NumberFormatException -> 0x0096 }
        r0 = (java.lang.String) r0;	 Catch:{ NumberFormatException -> 0x0096 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0096 }
        goto L_0x00c0;
    L_0x0096:
        r0 = new java.io.FileNotFoundException;	 Catch:{ NotFoundException -> 0x013a }
        r3 = new java.lang.StringBuilder;	 Catch:{ NotFoundException -> 0x013a }
        r3.<init>();	 Catch:{ NotFoundException -> 0x013a }
        r4 = "Single path segment is not a resource ID: ";
        r3.append(r4);	 Catch:{ NotFoundException -> 0x013a }
        r3.append(r10);	 Catch:{ NotFoundException -> 0x013a }
        r3 = r3.toString();	 Catch:{ NotFoundException -> 0x013a }
        r0.<init>(r3);	 Catch:{ NotFoundException -> 0x013a }
        throw r0;	 Catch:{ NotFoundException -> 0x013a }
    L_0x00ad:
        r8 = 2;
        if (r5 != r8) goto L_0x00de;
    L_0x00b0:
        r5 = r4.get(r7);	 Catch:{ NotFoundException -> 0x013a }
        r5 = (java.lang.String) r5;	 Catch:{ NotFoundException -> 0x013a }
        r4 = r4.get(r6);	 Catch:{ NotFoundException -> 0x013a }
        r4 = (java.lang.String) r4;	 Catch:{ NotFoundException -> 0x013a }
        r0 = r3.getIdentifier(r5, r4, r0);	 Catch:{ NotFoundException -> 0x013a }
    L_0x00c0:
        if (r0 == 0) goto L_0x00c7;
    L_0x00c2:
        r10 = r3.getDrawable(r0);	 Catch:{ NotFoundException -> 0x013a }
        return r10;
    L_0x00c7:
        r0 = new java.io.FileNotFoundException;	 Catch:{ NotFoundException -> 0x013a }
        r3 = new java.lang.StringBuilder;	 Catch:{ NotFoundException -> 0x013a }
        r3.<init>();	 Catch:{ NotFoundException -> 0x013a }
        r4 = "No resource found for: ";
        r3.append(r4);	 Catch:{ NotFoundException -> 0x013a }
        r3.append(r10);	 Catch:{ NotFoundException -> 0x013a }
        r3 = r3.toString();	 Catch:{ NotFoundException -> 0x013a }
        r0.<init>(r3);	 Catch:{ NotFoundException -> 0x013a }
        throw r0;	 Catch:{ NotFoundException -> 0x013a }
    L_0x00de:
        r0 = new java.io.FileNotFoundException;	 Catch:{ NotFoundException -> 0x013a }
        r3 = new java.lang.StringBuilder;	 Catch:{ NotFoundException -> 0x013a }
        r3.<init>();	 Catch:{ NotFoundException -> 0x013a }
        r4 = "More than two path segments: ";
        r3.append(r4);	 Catch:{ NotFoundException -> 0x013a }
        r3.append(r10);	 Catch:{ NotFoundException -> 0x013a }
        r3 = r3.toString();	 Catch:{ NotFoundException -> 0x013a }
        r0.<init>(r3);	 Catch:{ NotFoundException -> 0x013a }
        throw r0;	 Catch:{ NotFoundException -> 0x013a }
    L_0x00f5:
        r0 = new java.io.FileNotFoundException;	 Catch:{ NotFoundException -> 0x013a }
        r3 = new java.lang.StringBuilder;	 Catch:{ NotFoundException -> 0x013a }
        r3.<init>();	 Catch:{ NotFoundException -> 0x013a }
        r4 = "No path: ";
        r3.append(r4);	 Catch:{ NotFoundException -> 0x013a }
        r3.append(r10);	 Catch:{ NotFoundException -> 0x013a }
        r3 = r3.toString();	 Catch:{ NotFoundException -> 0x013a }
        r0.<init>(r3);	 Catch:{ NotFoundException -> 0x013a }
        throw r0;	 Catch:{ NotFoundException -> 0x013a }
    L_0x010c:
        r0 = new java.io.FileNotFoundException;	 Catch:{ NotFoundException -> 0x013a }
        r3 = new java.lang.StringBuilder;	 Catch:{ NotFoundException -> 0x013a }
        r3.<init>();	 Catch:{ NotFoundException -> 0x013a }
        r4 = "No package found for authority: ";
        r3.append(r4);	 Catch:{ NotFoundException -> 0x013a }
        r3.append(r10);	 Catch:{ NotFoundException -> 0x013a }
        r3 = r3.toString();	 Catch:{ NotFoundException -> 0x013a }
        r0.<init>(r3);	 Catch:{ NotFoundException -> 0x013a }
        throw r0;	 Catch:{ NotFoundException -> 0x013a }
    L_0x0123:
        r0 = new java.io.FileNotFoundException;	 Catch:{ NotFoundException -> 0x013a }
        r3 = new java.lang.StringBuilder;	 Catch:{ NotFoundException -> 0x013a }
        r3.<init>();	 Catch:{ NotFoundException -> 0x013a }
        r4 = "No authority: ";
        r3.append(r4);	 Catch:{ NotFoundException -> 0x013a }
        r3.append(r10);	 Catch:{ NotFoundException -> 0x013a }
        r3 = r3.toString();	 Catch:{ NotFoundException -> 0x013a }
        r0.<init>(r3);	 Catch:{ NotFoundException -> 0x013a }
        throw r0;	 Catch:{ NotFoundException -> 0x013a }
    L_0x013a:
        r0 = new java.io.FileNotFoundException;	 Catch:{ FileNotFoundException -> 0x0151 }
        r3 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x0151 }
        r3.<init>();	 Catch:{ FileNotFoundException -> 0x0151 }
        r4 = "Resource does not exist: ";
        r3.append(r4);	 Catch:{ FileNotFoundException -> 0x0151 }
        r3.append(r10);	 Catch:{ FileNotFoundException -> 0x0151 }
        r3 = r3.toString();	 Catch:{ FileNotFoundException -> 0x0151 }
        r0.<init>(r3);	 Catch:{ FileNotFoundException -> 0x0151 }
        throw r0;	 Catch:{ FileNotFoundException -> 0x0151 }
    L_0x0151:
        r0 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = "Icon not found: ";
        r3.append(r4);
        r3.append(r10);
        r10 = ", ";
        r3.append(r10);
        r10 = r0.getMessage();
        r3.append(r10);
        r10 = r3.toString();
        android.util.Log.w(r1, r10);
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.arq.a(android.net.Uri):android.graphics.drawable.Drawable");
    }

    private final Drawable b(String str) {
        ConstantState constantState = (ConstantState) this.n.get(str);
        return constantState != null ? constantState.newDrawable() : null;
    }

    private final void a(String str, Drawable drawable) {
        if (drawable != null) {
            this.n.put(str, drawable.getConstantState());
        }
    }

    public static String a(Cursor cursor, String str) {
        return arq.a(cursor, cursor.getColumnIndex(str));
    }

    private static String a(Cursor cursor, int i) {
        if (i != -1) {
            try {
                return cursor.getString(i);
            } catch (Exception e) {
                Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            }
        }
        return null;
    }
}
