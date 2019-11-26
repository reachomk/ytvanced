package defpackage;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.os.Bundle;
import java.util.Calendar;

/* renamed from: acml */
public final class acml extends nd {
    public OnDateSetListener Z;
    public Calendar aa;

    public final Dialog a(Bundle bundle) {
        return new DatePickerDialog(p(), this.Z, this.aa.get(1), this.aa.get(2), this.aa.get(5));
    }
}
