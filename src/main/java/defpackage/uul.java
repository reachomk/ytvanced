package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: uul */
public class uul extends Fragment implements OnCancelListener, OnDismissListener {
    public Dialog a;
    private boolean b = true;
    private boolean c = true;
    private int d = -1;
    private boolean e;
    private boolean f;

    public final void onCancel(DialogInterface dialogInterface) {
    }

    public final void a() {
        a(false);
    }

    private final void a(boolean z) {
        if (!this.f) {
            this.f = true;
            Dialog dialog = this.a;
            if (dialog != null) {
                dialog.dismiss();
                this.a = null;
            }
            this.e = true;
            if (this.d >= 0) {
                getFragmentManager().popBackStack(this.d, 1);
                this.d = -1;
                return;
            }
            FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
            beginTransaction.remove(this);
            if (z) {
                beginTransaction.commitAllowingStateLoss();
                return;
            }
            beginTransaction.commit();
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f = false;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f = false;
    }

    public final void onDetach() {
        super.onDetach();
        if (!this.f) {
            this.f = true;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.c = true;
        if (bundle != null) {
            this.b = bundle.getBoolean("android:cancelable", true);
            this.c = bundle.getBoolean("android:showsDialog", this.c);
            this.d = bundle.getInt("android:backStackId", -1);
        }
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (!this.c) {
            return super.onGetLayoutInflater(bundle);
        }
        this.a = b();
        this.a.requestWindowFeature(1);
        Dialog dialog = this.a;
        String str = "layout_inflater";
        if (dialog != null) {
            return (LayoutInflater) dialog.getContext().getSystemService(str);
        }
        return (LayoutInflater) getActivity().getSystemService(str);
    }

    private final Dialog b() {
        return new Dialog(getActivity(), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.e) {
            a(true);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.c) {
            if (this.a == null) {
                this.a = b();
                this.a.requestWindowFeature(1);
            }
            View view = getView();
            if (view != null) {
                if (view.getParent() == null) {
                    this.a.setContentView(view);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            Activity activity = getActivity();
            if (activity != null) {
                this.a.setOwnerActivity(activity);
            }
            this.a.setCancelable(this.b);
            this.a.setOnDismissListener(this);
            this.a.setOnCancelListener(this);
            if (bundle != null) {
                bundle = bundle.getBundle("android:savedDialogState");
                if (bundle != null) {
                    this.a.onRestoreInstanceState(bundle);
                }
            }
        }
    }

    public final void onStart() {
        super.onStart();
        Dialog dialog = this.a;
        if (dialog != null) {
            this.e = false;
            dialog.show();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.a;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        if (!this.b) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.c) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i = this.d;
        if (i != -1) {
            bundle.putInt("android:backStackId", i);
        }
    }

    public final void onStop() {
        super.onStop();
        Dialog dialog = this.a;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.a;
        if (dialog != null) {
            this.e = true;
            dialog.dismiss();
            this.a = null;
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("DialogFragment:");
        printWriter.print(str);
        printWriter.print("  cancelable=");
        printWriter.print(this.b);
        printWriter.print(" showsDialog=");
        printWriter.print(this.c);
        printWriter.print(" backStackId=");
        printWriter.println(this.d);
        printWriter.print(str);
        printWriter.print("  dialog=");
        printWriter.println(this.a);
        printWriter.print(str);
        printWriter.print("  viewDestroyed=");
        printWriter.print(this.e);
        printWriter.print(" dismissed=");
        printWriter.print(this.f);
        printWriter.print(" shownByMe=");
        printWriter.println(false);
    }
}
