package com.jidesoft.swing;

import java.awt.event.MouseEvent;

public interface TabEditingValidator {

    /**
     * This is called to determine if the follow mouse event should start editing for the give tabIndex.
     * 
     * @param tabIndex tab index
     * @param event mouse event
     * @return <code>true</code> to follow mouse event should start editing, <code>false</code> otherwise
     */
    public boolean shouldStartEdit(int tabIndex, MouseEvent event);

    /**
     * This should validate that the following value would pass is canStopEdit is called. No feedback should be
     * given for this call. This is used when destroying a tab it will either call commit edit or cancel
     * 
     * @param tabIndex tab index
     * @param tabText tab text
     * @return <code>true</code> if valid, <code>false</code> otherwise
     */
    public boolean isValid(int tabIndex, String tabText);
    
    /**
     * This is called before editStop. If this returns false then the editing will continue.
     * It is the responsibility of the implementation to give any feedback.
     * 
     * @param tabIndex tab index
     * @param tabText tab text
     * @return <code>true</code> if invalid, <code>false</code> otherwise
     */
    public boolean alertIfInvalid(int tabIndex, String tabText);

}
