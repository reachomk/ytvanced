package com.google.android.libraries.youtube.edit.filters.ui;

import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.acvx;
import defpackage.amqw;
import defpackage.uit;
import defpackage.xrn;
import defpackage.zjp;
import defpackage.zjq;
import defpackage.zjr;
import defpackage.zjt;
import defpackage.zmo;
import defpackage.zng;
import defpackage.zod;
import defpackage.zoe;
import defpackage.zog;
import defpackage.zoi;
import defpackage.zok;
import defpackage.zol;
import defpackage.zom;
import defpackage.zon;
import defpackage.zoo;
import defpackage.zop;
import defpackage.zoq;
import defpackage.zor;
import defpackage.zos;
import defpackage.zot;
import defpackage.zou;
import defpackage.zov;
import defpackage.zow;
import defpackage.zpa;
import java.util.Collection;
import java.util.List;

public class ChooseFilterView extends LinearLayout {
    public final zos a;
    public final LinearLayout b;
    public HorizontalScrollView c;
    public zoe d;
    public zmo e;
    public boolean f = false;
    public ValueAnimator g;

    public ChooseFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.choose_filter_view, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zjq.a, 0, 0);
        int i = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        int i2 = i != 1 ? i != 2 ? R.layout.choose_filter_list_item : R.layout.choose_filter_list_item_camera_preset : R.layout.choose_filter_list_item_camera;
        this.d = new zoe(this);
        this.a = new zos(getContext(), i2);
        this.b = (LinearLayout) findViewById(R.id.filter_list);
        this.c = (HorizontalScrollView) findViewById(R.id.filter_list_container);
        setImportantForAccessibility(1);
        setAlpha(0.0f);
    }

    public final void a(zng zng) {
        zng.a(new zoi(this, zng));
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zmo zmo = this.e;
        if (zmo != null) {
            zmo.a();
        }
        zos zos = this.a;
        for (zmo a : zos.j) {
            a.a();
        }
        zos.j.clear();
    }

    public final zmo a(zoq zoq) {
        zoe zoe = this.d;
        zoe.c = zoq;
        zoe.a();
        return new zod(zoe);
    }

    public final zmo a(zop zop) {
        zoe zoe = this.d;
        zoe.d = zop;
        if (zoe.a.c() != null && zoe.a.f) {
            zoe.b();
        }
        return new zog(zoe);
    }

    public final void a(List list, View view, boolean z, boolean z2, SharedPreferences sharedPreferences) {
        a(list, view, z, z2, sharedPreferences, null);
    }

    public final void a(List list, View view, boolean z, boolean z2, SharedPreferences sharedPreferences, zng zng) {
        View view2 = view;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        zng zng2 = zng;
        amqw.a(list.isEmpty() ^ 1);
        if (view2 != null) {
            this.a.a(view2);
        }
        zos zos = this.a;
        Object obj = this.b;
        HorizontalScrollView horizontalScrollView = this.c;
        amqw.a(zos.a);
        amqw.b(zos.i.isEmpty());
        zos.i.addAll((Collection) amqw.a((Object) list));
        amqw.a(obj);
        zos.k = horizontalScrollView;
        amqw.b((zng2 != null ? null : 1) != (sharedPreferences2 != null ? null : 1));
        zos.m = zng2;
        LayoutInflater layoutInflater = (LayoutInflater) zos.a.getSystemService("layout_inflater");
        if (sharedPreferences2 != null) {
            zos.l = new zjp(list, sharedPreferences2);
        } else {
            List list2 = list;
        }
        int i = 0;
        for (zjt zjt : list) {
            View inflate = layoutInflater.inflate(zos.o, obj, false);
            String a = zjt.a(layoutInflater.getContext());
            if (a != null) {
                inflate.setContentDescription(a);
                TextView textView = (TextView) inflate.findViewById(R.id.filter_text);
                if (textView != null) {
                    textView.setText(a);
                }
            }
            inflate.setOnClickListener(new zov(zos, zjt));
            inflate.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
            i = Math.max(i, inflate.getMeasuredHeight());
            TextureView textureView = (TextureView) inflate.findViewById(R.id.filter_thumbnail);
            zos.c.put(zjt.a, textureView);
            if (zng2 != null) {
                zng2.a(zjt.a, textureView);
            }
            ImageView imageView = (ImageView) inflate.findViewById(R.id.new_content_dot);
            if (z && !zjt.b()) {
                imageView.setVisibility(0);
            }
            if (z2) {
                inflate.findViewById(R.id.filter_thumbnail_spinner).setVisibility(0);
            }
            zos.d.put(zjt.a, imageView);
            zos.e.put(zjt.a, inflate);
            obj.addView(inflate);
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.enableTransitionType(4);
            ((ViewGroup) inflate).setLayoutTransition(layoutTransition);
        }
        zos.n = i;
        LayoutParams layoutParams = (LayoutParams) horizontalScrollView.getLayoutParams();
        layoutParams.height = zos.n;
        horizontalScrollView.setLayoutParams(layoutParams);
        zos.b();
        if (zng2 != null) {
            zos.j.add(zng2.a(new zor(zos, horizontalScrollView)));
            if (!zjt.a(zos.f)) {
                zng2.a(zos.f);
            }
            zos.j.add(zng2.a(new zou(zos)));
        }
        zos.registerObserver(new zpa(zos, horizontalScrollView));
        horizontalScrollView.post(new zot(zos));
        horizontalScrollView.postDelayed(new zow(zos), 1000);
        this.d.a();
        if (this.f) {
            a(true, false);
        }
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER_STATE", super.onSaveInstanceState());
        bundle.putString("SELECTED_FILTER", this.a.f);
        bundle.putBoolean("CHOOSE_FILTER_VIEW_VISIBLE", this.f);
        return bundle;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.a.c(bundle.getString("SELECTED_FILTER"));
            a(bundle.getBoolean("CHOOSE_FILTER_VIEW_VISIBLE"), false);
            parcelable = bundle.getParcelable("SUPER_STATE");
        }
        super.onRestoreInstanceState(parcelable);
    }

    private final void a(boolean z, boolean z2) {
        this.f = z;
        post(new zok(this, z, z2));
    }

    public final ValueAnimator a(int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setDuration(250);
        ofInt.addUpdateListener(new zom(this));
        if (i2 == 1) {
            ofInt.addListener(new zol(this));
            a(getContext().getString(R.string.accessibility_filter_view_closed));
        } else {
            ofInt.addListener(new zoo(this));
            a(getContext().getString(R.string.accessibility_filter_view_shown));
        }
        return ofInt;
    }

    private final void a(String str) {
        if (xrn.c(getContext())) {
            xrn.a(getContext(), this, str);
        }
    }

    public final void a(zon zon) {
        this.a.g = zon;
    }

    public final void a() {
        a(true);
    }

    public final void a(boolean z) {
        a(this.f ^ 1, z);
    }

    public final int b() {
        return this.a.n;
    }

    public final zos c() {
        return this.a.a() ? this.a : null;
    }

    public final void a(acvx acvx, uit uit) {
        zos zos = this.a;
        zos.h = uit;
        for (zjt zjt : zos.i) {
            zjr a = zjr.a(acvx, zjt.a);
            acvx.a(a.a, a.b);
        }
    }

    public final void a(View view) {
        this.a.a(view);
    }
}
