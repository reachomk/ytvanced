package defpackage;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import com.google.android.youtube.R;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: uqx */
public final class uqx extends nd {
    public urs Z;
    public final Calendar aa;
    private final Calendar ab = new GregorianCalendar(Locale.getDefault());
    private final Calendar ac;
    private final urg ad;
    private final urd ae;
    private final ure af;
    private final String[] ag;
    private ViewGroup ah;
    private NumberPicker ai;
    private NumberPicker aj;
    private NumberPicker ak;
    private boolean al;

    public uqx() {
        boolean z = true;
        int i = 0;
        this.ac = new GregorianCalendar(1900, 0, 1);
        this.ad = new urg(this);
        this.ae = new urd(this);
        this.af = new ure(this);
        this.aa = new GregorianCalendar(Locale.getDefault());
        String[] strArr = new String[12];
        String[] shortMonths = new DateFormatSymbols().getShortMonths();
        if (Character.isDigit(shortMonths[0].charAt(0))) {
            int i2 = 0;
            while (i2 < 12) {
                Object[] objArr = new Object[1];
                int i3 = i2 + 1;
                objArr[0] = Integer.valueOf(i3);
                strArr[i2] = String.format("%d", objArr);
                i2 = i3;
            }
        } else {
            if (shortMonths.length < 12) {
                z = false;
            }
            amqw.a(z);
            while (i < 12) {
                strArr[i] = shortMonths[i];
                i++;
            }
        }
        this.ag = strArr;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putLong("birthday_picker_millis", this.aa.getTimeInMillis());
    }

    public final Dialog a(Bundle bundle) {
        ((urc) xse.a(p())).a(this);
        bundle = this.j;
        int i = 0;
        View inflate = p().getLayoutInflater().inflate(R.layout.channel_creation_birthday_picker, null, false);
        this.ah = (ViewGroup) inflate.findViewById(R.id.birthday_picker_layout);
        this.ai = (NumberPicker) inflate.findViewById(R.id.year);
        this.ai.setSaveFromParentEnabled(false);
        this.ai.setOnValueChangedListener(this.ad);
        boolean z = bundle.getBoolean("birthday_picker_hide_year");
        this.al = z;
        if (z) {
            this.ai.setVisibility(8);
        } else {
            this.ai.setMaxValue(this.ab.get(1));
            this.ai.setMinValue(this.ac.get(1));
        }
        this.aj = (NumberPicker) inflate.findViewById(R.id.month);
        this.aj.setSaveFromParentEnabled(false);
        this.aj.setOnValueChangedListener(this.ae);
        this.aj.setMinValue(0);
        this.aj.setMaxValue(11);
        this.aj.setDisplayedValues(this.ag);
        this.ak = (NumberPicker) inflate.findViewById(R.id.day);
        this.ak.setSaveFromParentEnabled(false);
        this.ak.setOnValueChangedListener(this.af);
        this.ak.setMinValue(1);
        String str = "dMy";
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(Locale.getDefault(), str);
        if (!(bestDateTimePattern == null || bestDateTimePattern.equals(str) || bestDateTimePattern.indexOf(100) == -1 || bestDateTimePattern.indexOf(121) == -1 || (bestDateTimePattern.indexOf(77) == -1 && bestDateTimePattern.indexOf(76) == -1))) {
            this.ah.removeAllViews();
            Object obj = null;
            Object obj2 = null;
            Object obj3 = null;
            while (i < bestDateTimePattern.length()) {
                char charAt = bestDateTimePattern.charAt(i);
                if (charAt == 'L' || charAt == 'M') {
                    if (obj3 == null) {
                        this.ah.addView(this.aj);
                        obj3 = 1;
                    }
                } else if (charAt != 'd') {
                    if (charAt == 'y' && obj == null) {
                        this.ah.addView(this.ai);
                        obj = 1;
                    }
                } else if (obj2 == null) {
                    this.ah.addView(this.ak);
                    obj2 = 1;
                }
                i++;
            }
        }
        this.aa.set(bundle.getInt("birthday_picker_year"), bundle.getInt("birthday_picker_month"), bundle.getInt("birthday_picker_day"));
        W();
        return new Builder(p()).setView(inflate).setTitle(bundle.getCharSequence("birthday_picker_title")).setPositiveButton(R.string.ok, new ura(this)).setNegativeButton(R.string.cancel, uqz.a).create();
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle != null) {
            this.aa.setTimeInMillis(bundle.getLong("birthday_picker_millis"));
            W();
        }
    }

    public final void W() {
        if (this.aa.after(this.ab)) {
            this.aa.setTimeInMillis(this.ab.getTimeInMillis());
        } else if (this.aa.before(this.ac)) {
            this.aa.setTimeInMillis(this.ac.getTimeInMillis());
        }
        if (this.al) {
            this.aa.set(1, this.j.getInt("birthday_picker_year"));
        } else {
            this.ai.setValue(this.aa.get(1));
        }
        this.aj.setValue(this.aa.get(2));
        if (this.aa.get(5) < 15) {
            this.ak.setMaxValue(X());
        } else {
            this.ak.setMaxValue(this.aa.getActualMaximum(5));
        }
        this.ak.setValue(this.aa.get(5));
    }

    public final int X() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(Locale.getDefault());
        gregorianCalendar.setTimeInMillis(this.aa.getTimeInMillis());
        gregorianCalendar.add(2, -1);
        return gregorianCalendar.getActualMaximum(5);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.Z.h();
    }
}
