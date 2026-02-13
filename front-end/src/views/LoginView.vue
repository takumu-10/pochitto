<script setup lang="ts">
import { inject } from 'vue'

const loginAction = inject('loginAction') as () => void
</script>

<template>
  <div class="login-card">
    <h2>おかえりなさい</h2>
    <div class="input-group">
      <label>Email</label>
      <input type="email" placeholder="example@mail.com">
    </div>
    <div class="input-group">
      <label>Password</label>
      <input type="password" placeholder="••••••••">
    </div>
    <button class="login-submit" @click="loginAction">ログイン</button>
  </div>
</template>

<style scoped>
.login-card {
  background: white;
  padding: 2.5rem;
  border-radius: 24px;
  box-shadow: 0 10px 25px rgba(0,0,0,0.05);
  width: 100%;
  max-width: 350px;
}

h2 {
  margin-bottom: 2rem;
  color: #2c3e50;
}

.input-group {
  text-align: left;
  margin-bottom: 1.5rem;
}

label {
  display: block;
  font-size: 0.8rem;
  color: #95a5a6;
  margin-bottom: 5px;
  margin-left: 4px;
}

input {
  width: 100%;
  padding: 12px 16px;
  border: 1px solid #edf2f7;
  background: #f8fafc;
  border-radius: 12px;
  font-size: 1rem;
  outline: none;
  transition: border 0.2s;
}

input:focus {
  border: 1px solid #42b883;
}

.login-submit {
  width: 100%;
  background: #2c3e50;
  color: white;
  border: none;
  padding: 14px;
  border-radius: 12px;
  font-weight: bold;
  cursor: pointer;
  margin-top: 1rem;
}
</style>