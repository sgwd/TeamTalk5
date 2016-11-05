/*
 * Copyright (c) 2005-2016, BearWare.dk
 * 
 * Contact Information:
 *
 * Bjoern D. Rasmussen
 * Kirketoften 5
 * DK-8260 Viby J
 * Denmark
 * Email: contact@bearware.dk
 * Phone: +45 20 20 54 59
 * Web: http://www.bearware.dk
 *
 * This source code is part of the TeamTalk 5 SDK owned by
 * BearWare.dk. All copyright statements may not be removed 
 * or altered from any source distribution. If you use this
 * software in a product, an acknowledgment in the product 
 * documentation is required.
 *
 */

package dk.bearware;

public class TeamTalk5Pro extends TeamTalkBase
{
    public TeamTalk5Pro() {
        super(true);
    }

    private TeamTalk5Pro(boolean create_instance) {
        super(create_instance);
    }

    public static void loadLibrary() {
        new TeamTalk5Pro(false);
    }

    static {
        System.loadLibrary("TeamTalk5Pro-jni");
    }
}
