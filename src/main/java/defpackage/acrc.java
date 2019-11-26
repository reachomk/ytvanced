package defpackage;

import android.app.DatePickerDialog.OnDateSetListener;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: acrc */
public final class acrc implements OnDateSetListener, OnTimeSetListener, OnClickListener {
    public final ViewGroup a;
    private final TextView b;
    private final TextView c;
    private final long d;
    private final int e;
    private final Context f;
    private final nt g;
    private Calendar h;

    public acrc(atqw atqw, ViewGroup viewGroup, TextView textView, TextView textView2, Context context, nt ntVar) {
        this.g = ntVar;
        this.f = (Context) amqw.a((Object) context);
        amqw.a((Object) atqw);
        this.d = atqw.c;
        this.e = atqw.b;
        this.a = (ViewGroup) amqw.a((Object) viewGroup);
        this.b = (TextView) amqw.a((Object) textView);
        this.c = (TextView) amqw.a((Object) textView2);
    }

    public final void a() {
        this.a.setVisibility(0);
        Calendar calendar = this.h;
        if (calendar == null) {
            calendar = Calendar.getInstance();
            if (this.d != 0) {
                calendar.setTimeInMillis(TimeUnit.SECONDS.toMillis(this.d));
            }
            if (this.e != 0) {
                double d = (double) calendar.get(12);
                double d2 = (double) this.e;
                Double.isNaN(d);
                Double.isNaN(d2);
                d = Math.ceil(d / d2);
                d2 = (double) this.e;
                Double.isNaN(d2);
                int i = (int) (d * d2);
                calendar.add(10, i / 60);
                calendar.set(12, i % 60);
            }
            a(calendar);
        } else {
            a(calendar);
        }
        this.b.setOnClickListener(this);
        this.c.setOnClickListener(this);
    }

    public final void a(Calendar calendar) {
        this.h = calendar;
        c();
    }

    public final Date b() {
        Calendar calendar = this.h;
        return calendar != null ? calendar.getTime() : null;
    }

    private final void c() {
        this.b.setText(DateFormat.getMediumDateFormat(this.f).format(this.h.getTime()));
        this.c.setText(DateFormat.getTimeFormat(this.f).format(this.h.getTime()));
    }

    public final void onClick(View view) {
        if (view == this.b) {
            acml acml = new acml();
            acml.aa = this.h;
            acml.Z = this;
            acml.a(this.g, "datePicker");
        } else if (view == this.c) {
            acqv acqv = new acqv();
            acqv.aa = this.h;
            acqv.Z = this;
            acqv.a(this.g, "timePicker");
        }
    }

    public final void onTimeSet(TimePicker timePicker, int i, int i2) {
        this.h.set(11, i);
        this.h.set(12, i2);
        c();
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        this.h.set(1, i);
        this.h.set(2, i2);
        this.h.set(5, i3);
        c();
    }
}
