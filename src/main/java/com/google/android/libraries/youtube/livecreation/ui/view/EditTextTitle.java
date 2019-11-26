package com.google.android.libraries.youtube.livecreation.ui.view;

import android.content.Context;
import android.support.design.textfield.TextInputEditText;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

public class EditTextTitle extends TextInputEditText {
    public EditTextTitle(Context context) {
        super(context);
    }

    public EditTextTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public EditTextTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions &= -256;
        editorInfo.imeOptions |= 6;
        editorInfo.imeOptions &= -1073741825;
        return onCreateInputConnection;
    }
}
