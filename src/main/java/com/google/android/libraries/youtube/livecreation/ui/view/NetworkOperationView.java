package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import defpackage.acsv;

public class NetworkOperationView extends FrameLayout {
    public int a = -1;
    private Button b;
    private Button c;
    private TextView d;
    private ProgressBar e;
    private WaitingIndicatorView f;
    private TextView g;

    public NetworkOperationView(Context context) {
        super(context);
        a(context);
    }

    public NetworkOperationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public NetworkOperationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    private final void a(Context context) {
        inflate(context, R.layout.lc_network_operation_view, this);
        this.b = (Button) findViewById(R.id.action_button_positive);
        this.c = (Button) findViewById(R.id.action_button_negative);
        this.d = (TextView) findViewById(R.id.error_message_text);
        this.e = (ProgressBar) findViewById(R.id.spinner);
        this.g = (TextView) findViewById(R.id.progress_indicator_text);
        this.f = (WaitingIndicatorView) findViewById(R.id.network_transition_spinner);
        a(0);
    }

    private final void a() {
        this.f.b();
        this.f.setVisibility(8);
        this.e.setVisibility(0);
        if (!TextUtils.isEmpty(this.g.getText())) {
            this.g.setVisibility(0);
        }
    }

    private final void b() {
        this.e.setVisibility(8);
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.g.setText("");
    }

    public final void a(int i) {
        this.a = i;
        if (i == 0) {
            a();
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.d.setVisibility(8);
        } else if (i == 1) {
            b();
            this.b.setVisibility(0);
            this.c.setVisibility(0);
            this.d.setVisibility(0);
        } else if (i == 2) {
            b();
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.d.setVisibility(8);
        } else if (i == 4) {
            a();
            this.g.setVisibility(8);
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.d.setVisibility(0);
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("Unknown currentMode: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void a(OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public final void b(OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    /* Access modifiers changed, original: protected|final */
    public final Parcelable onSaveInstanceState() {
        acsv acsv = new acsv(super.onSaveInstanceState());
        acsv.a = this.a;
        return acsv;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof acsv) {
            acsv acsv = (acsv) parcelable;
            super.onRestoreInstanceState(acsv.getSuperState());
            a(acsv.a);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }
}
