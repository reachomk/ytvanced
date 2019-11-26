package com.google.android.libraries.youtube.account.verification.ui;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
import defpackage.amqw;
import defpackage.uzx;
import defpackage.uzz;
import defpackage.vaa;
import defpackage.vab;

public class CodeInputView extends RelativeLayout implements OnClickListener, uzx {
    public CodeInputEditText[] a;
    public vab b;
    public boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private View[] j;
    private int k;

    public CodeInputView(Context context) {
        super(context);
        this.a = new CodeInputEditText[6];
        this.j = new View[6];
        this.c = true;
        a(context, null, 0);
    }

    public CodeInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new CodeInputEditText[6];
        this.j = new View[6];
        this.c = true;
        a(context, attributeSet, 0);
    }

    public CodeInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new CodeInputEditText[6];
        this.j = new View[6];
        this.c = true;
        a(context, attributeSet, i);
    }

    private final void a(Context context, AttributeSet attributeSet, int i) {
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.code_input_view, this, true);
        Theme theme = context.getTheme();
        int i2 = vaa.a;
        int i3 = 0;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, i2, i, 0);
        try {
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.e = obtainStyledAttributes.getColor(1, -1);
            i = 2;
            this.f = obtainStyledAttributes.getDimensionPixelSize(2, -1);
            i2 = 3;
            this.g = obtainStyledAttributes.getDimensionPixelSize(3, -1);
            int i4 = 4;
            this.h = obtainStyledAttributes.getColor(i4, -1);
            int i5 = 5;
            this.i = obtainStyledAttributes.getColor(i5, -1);
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.digit_one_container);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.digit_two_container);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.digit_three_container);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(R.id.digit_four_container);
            ViewGroup viewGroup5 = (ViewGroup) findViewById(R.id.digit_five_container);
            ViewGroup viewGroup6 = (ViewGroup) findViewById(R.id.digit_six_container);
            this.a[0] = (CodeInputEditText) viewGroup.findViewById(R.id.digit);
            this.a[1] = (CodeInputEditText) viewGroup2.findViewById(R.id.digit);
            this.a[i] = (CodeInputEditText) viewGroup3.findViewById(R.id.digit);
            this.a[i2] = (CodeInputEditText) viewGroup4.findViewById(R.id.digit);
            this.a[i4] = (CodeInputEditText) viewGroup5.findViewById(R.id.digit);
            this.a[i5] = (CodeInputEditText) viewGroup6.findViewById(R.id.digit);
            this.j[0] = viewGroup.findViewById(R.id.underline);
            this.j[1] = viewGroup2.findViewById(R.id.underline);
            this.j[i] = viewGroup3.findViewById(R.id.underline);
            this.j[i2] = viewGroup4.findViewById(R.id.underline);
            this.j[i4] = viewGroup5.findViewById(R.id.underline);
            this.j[i5] = viewGroup6.findViewById(R.id.underline);
            int i6 = 0;
            while (true) {
                CodeInputEditText[] codeInputEditTextArr = this.a;
                if (i6 >= codeInputEditTextArr.length) {
                    break;
                }
                codeInputEditTextArr[i6].setTag(Integer.valueOf(i6));
                this.a[i6].setTextColor(this.e);
                this.a[i6].setTextSize((float) this.d);
                this.a[i6].addTextChangedListener(new uzz(this, i6));
                this.a[i6].a = this;
                i6++;
            }
            while (true) {
                View[] viewArr = this.j;
                if (i3 < viewArr.length) {
                    viewArr[i3].setBackgroundColor(this.i);
                    LayoutParams layoutParams = this.j[i3].getLayoutParams();
                    layoutParams.height = this.g;
                    this.j[i3].setLayoutParams(layoutParams);
                    i3++;
                } else {
                    setOnClickListener(this);
                    return;
                }
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void onClick(View view) {
        b();
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int i = 0;
        while (true) {
            CodeInputEditText[] codeInputEditTextArr = this.a;
            if (i < codeInputEditTextArr.length) {
                codeInputEditTextArr[i].setEnabled(z);
                this.j[i].setEnabled(z);
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public final void a(CodeInputEditText codeInputEditText) {
        if (this.c) {
            int b = b(codeInputEditText);
            if (b > 0) {
                if (b == 5 && codeInputEditText.getText().length() > 0) {
                    c(5);
                    return;
                }
                c(b - 1);
            }
        }
    }

    public static int b(CodeInputEditText codeInputEditText) {
        amqw.a(codeInputEditText.getTag() instanceof Integer, (Object) "Digit tag should be an integer.");
        return ((Integer) codeInputEditText.getTag()).intValue();
    }

    public final String a() {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (true) {
            CodeInputEditText[] codeInputEditTextArr = this.a;
            if (i >= codeInputEditTextArr.length) {
                return stringBuilder.toString();
            }
            stringBuilder.append(codeInputEditTextArr[i].getText().toString().trim());
            i++;
        }
    }

    public final void a(String str) {
        int i = 0;
        amqw.a(str.length() <= 6);
        amqw.a(this.a.length == 6);
        this.c = false;
        while (i < str.length()) {
            int i2 = i + 1;
            this.a[i].setText(str.substring(i, i2));
            i = i2;
        }
        this.c = true;
    }

    public final void a(int i) {
        int i2 = 0;
        while (true) {
            View[] viewArr = this.j;
            if (i2 < viewArr.length) {
                int i3;
                View view = viewArr[i2];
                if (i2 != i) {
                    i3 = this.i;
                } else {
                    i3 = this.h;
                }
                view.setBackgroundColor(i3);
                LayoutParams layoutParams = this.j[i2].getLayoutParams();
                if (i2 != i) {
                    i3 = this.g;
                } else {
                    i3 = this.f;
                }
                layoutParams.height = i3;
                this.j[i2].setLayoutParams(layoutParams);
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b(int i) {
        boolean z = false;
        if (i >= 0 && i < 6) {
            z = true;
        }
        amqw.a(z);
        this.k = i;
    }

    public final void c(int i) {
        boolean z = false;
        if (i >= 0 && i < 6) {
            z = true;
        }
        amqw.a(z);
        b(i);
        CodeInputEditText codeInputEditText = this.a[i];
        codeInputEditText.requestFocus();
        codeInputEditText.setSelection(codeInputEditText.getText().length());
        if (i != 5 || codeInputEditText.getText().length() == 0) {
            a(i);
        }
    }

    public final void b() {
        if (!this.a[this.k].isFocused()) {
            c(this.k);
        }
        Context context = getContext();
        if (context != null) {
            ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(this.a[this.k], 0);
        }
    }

    public final void c() {
        Context context = getContext();
        if (context != null) {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(this.a[this.k].getWindowToken(), 0);
        }
    }
}
