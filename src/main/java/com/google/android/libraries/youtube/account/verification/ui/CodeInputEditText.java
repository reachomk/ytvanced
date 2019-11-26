package com.google.android.libraries.youtube.account.verification.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import defpackage.uzx;
import defpackage.uzy;

public class CodeInputEditText extends EditText {
    public uzx a;

    public CodeInputEditText(Context context) {
        super(context);
    }

    public CodeInputEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CodeInputEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new uzy(this, super.onCreateInputConnection(editorInfo));
    }
}
