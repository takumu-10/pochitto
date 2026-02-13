<script setup lang="ts">
import { ref, provide } from 'vue'
import { RouterView, useRouter } from 'vue-router'

const router = useRouter()
const isLoggedIn = ref(false)

const login = () => {
  isLoggedIn.value = true
  router.push('/')
}

provide('loginAction', login)
provide('isLoggedIn', isLoggedIn)
</script>

<template>
  <div class="master-container">
    <RouterView />
  </div>
</template>

<style>
/* scopedを外して、body全体を制御します */
body {
  margin: 0;
  padding: 0;
  background-color: #f0f2f5; /* 少しグレーにするとカードが引き立ちます */
}

.master-container {
  display: flex;
  justify-content: center; /* 左右中央 */
  align-items: center;     /* 上下中央 */
  width: 100vw;            /* 画面横幅いっぱい */
  height: 100vh;           /* 画面高さいっぱい */
}
</style>