package defpackage;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.os.Bundle;
import android.text.format.DateFormat;
import java.util.Calendar;

/* renamed from: acqv */
public final class acqv extends nd {
    public OnTimeSetListener Z;
    public Calendar aa;

    public final Dialog a(Bundle bundle) {
        return new TimePickerDialog(p(), this.Z, this.aa.get(11), this.aa.get(12), DateFormat.is24HourFormat(p()));
    }
}
