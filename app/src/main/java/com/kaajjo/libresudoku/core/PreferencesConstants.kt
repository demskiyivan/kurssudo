package com.kaajjo.libresudoku.core

// Default values for preferences
class PreferencesConstants {
    companion object {
        const val MISTAKES_LIMIT = 3

        // Game settings
        const val DEFAULT_MISTAKES_LIMIT = false
        const val DEFAULT_HINTS_DISABLED = false
        const val DEFAULT_SHOW_TIMER = true
        const val DEFAULT_GAME_RESET_TIMER = true
        const val DEFAULT_HIGHLIGHT_MISTAKES = 1
        const val DEFAULT_HIGHLIGHT_IDENTICAL = true
        const val DEFAULT_REMAINING_USES = true
        const val DEFAULT_POSITION_LINES = true
        const val DEFAULT_AUTO_ERASE_NOTES = true
        const val DEFAULT_FONT_SIZE_FACTOR = 0
        const val DEFAULT_KEEP_SCREEN_ON = true
        const val DEFAULT_INPUT_METHOD = 1
        const val DEFAULT_FUN_KEYBOARD_OVER_NUM = false
        const val DEFAULT_SAVE_LAST_SELECTED_DIFF_TYPE = true
        const val DEFAULT_AUTOBACKUP_INTERVAL = 24L
        const val DEFAULT_AUTO_BACKUPS_NUMBER = 3
        const val DEFAULT_ADVANCED_HINT = false
        const val DEFAULT_AUTOUPDATE_CHANNEL = 2 // Beta channel

        const val DEFAULT_DYNAMIC_COLORS = true
        const val DEFAULT_DARK_THEME = 0
        const val DEFAULT_AMOLED_BLACK = false
        const val DEFAULT_MONET_SUDOKU_BOARD = true
        const val DEFAULT_BOARD_CROSS_HIGHLIGHT = false
        const val DEFAULT_THEME_SEED_COLOR = -16711936 /* Color.Green.toArgb() */
        const val DEFAULT_PALETTE_STYLE = 0
    }
}